package com.ncu.Spring.LoanOrganisationProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoanProcess{

	
	// Step 1 Sourcing - To input the basic information from the user
	public void Sourcing(ICustomer customer) {
		
		System.out.println("Sourcing");
		Scanner obj = new Scanner(System.in);
		System.out.println("Name");
		String name = obj.next();
		System.out.println("Age");
		int age = obj.nextInt();
		System.out.println("Address : ");
		System.out.println("House_no");
		int h_no = obj.nextInt();
		System.out.println("City");
		String city = obj.next();
		System.out.println("State");
		String state = obj.next();
		System.out.println("Pincode");
		int pincode = obj.nextInt();
		System.out.println("Phone Number");
		String phno = obj.next();
		while(phno.length()!=10)
		{
			System.out.println("Enter 10 digit mobile number");
			phno = obj.next();
		}
		System.out.println("Email");
		String email = obj.next();
		System.out.println("Loan type");
		String ltype = obj.next();
		System.out.println("Amount");
		double amount = obj.nextDouble();
		System.out.println("Duration of loan");
		int duration = obj.nextInt();
		customer.getInfo().setFull_name(name);
		customer.getInfo().setAge(age);
		customer.getInfo().setPhn(phno);
		customer.getInfo().setEmail(email);
		customer.getAdd().setHouse_no(h_no);
		customer.getAdd().setCity(city);
		customer.getAdd().setState(state);
		customer.getAdd().setPincode(pincode);
		customer.getLinfo().setLoanType(ltype);
		customer.getLinfo().setAmount(amount);
		customer.getLinfo().setDuration(duration);
		String appno = customer.generateApp_no();
		customer.setApp_no(appno);
		System.out.println("Sourcing Done ");
		System.out.println(appno);
		System.out.println();
		System.out.println("Move forward to data entry...press 1");
		int j = obj.nextInt();
		if(j==1)
		{
			DataEntry(customer);
		}
		
		
		
	}
	
	// Further the different entries like assets liabilities are given by user and the total income is calculated
	public void DataEntry(ICustomer customer)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("your Application number "+customer.getApp_no());
		System.out.println("Name : "+customer.getInfo().getFull_name());
		System.out.println("email : "+customer.getInfo().getEmail());
		System.out.println("ph.no : "+customer.getInfo().getPhn());
		System.out.println("Loan Type : "+customer.getLinfo().getLoanType());
		System.out.println("Loan Duration"+customer.getLinfo().getDuration());
		
		System.out.println("Data Entry");
		System.out.println("Income ");
		double income = obj.nextDouble();
		long suml=0,suma=0;
		System.out.println("Assets");
		List<Long> assets = new ArrayList<Long>();
		int input=1;
		while(input==1)
		{
			long asset = obj.nextInt();
			suma=suma+asset;
			assets.add(asset);
			System.out.println("Enter more(0/1)");
			int temp = obj.nextInt();
			input=temp;
		}
		input=1;
		System.out.println("Liabilities ");
		List<Integer> liabilities = new ArrayList<>();
		while(input==1)
		{
			int liability = obj.nextInt();
			suml=suml+liability;
			liabilities.add(liability);
			System.out.println("Enter more(0/1)");
			int temp = obj.nextInt();
			input=temp;
		}
		customer.getLinfo().setTotalincome(income+suma-suml);
		
		System.out.println("Total income=income+assets-liability = "+customer.getLinfo().getTotalincome());
		
		
		System.out.println("Data Emtry Done");
		System.out.println();
		System.out.println("Move forward to dedupe...press 1");
		int j = obj.nextInt();
		if(j==1)
		{
			dedupe(customer);
		}
		
	}
	// Dedupe function to check whether the user is a fraud or a blacklisted person
	public void dedupe(ICustomer customer)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Dedupe Check");
		System.out.println("Aadhar number");
		String aadhar = obj.next();
		while(aadhar.length()!=16)
		{
			System.out.println("Enter valid aadhar number");
			aadhar = obj.next();
		}
		customer.getInfo().setAadharCard(aadhar);
		int pancount=0;
		System.out.println("PAN number");
		String pan = obj.next();
		while(pan.length()!=10)
		{
			System.out.println("Enter valid pan number (put alphabets in Capitals)");
			pan=obj.next();
			
		}
		char panchar[] = pan.toCharArray();
		int i,val=0,count=0,count1=0,count2=0,j;
		while(val==1)
		{
			for(i=0;i<=4;i++)
			{
				if(panchar[i]<'A'||panchar[i]>'Z')
					count++;
			}
			
			for(j=5;j<=8;j++)
			{
				if(panchar[j]<48||panchar[j]>57)
				{
					count1++;
				}
			}
			
			if(panchar[panchar.length-1]<'A'||panchar[panchar.length-1]>'Z')
			{
				count2++;
			}
			
			
			
			if(count>=1||count1>=1||count2>=1)
			{
				System.out.println("Enter valid pan number");
				pan= obj.next();
				panchar=pan.toCharArray();
			}
			
			if(count==0 && count1==0 && count2==0)
			{
				val=0;
			}
			count=0;
			count1=0;
		}
		customer.getInfo().setPanCard(pan);
		int negativescore=0;
		
		for(Customer negCustomer:customer.getNegCustomer())
		{
			negativescore = isNegative(customer,negCustomer);
		}	
		
		if(negativescore>0)
		{
			customer.setRemarks("Loan rejected! Your details were found in Dedupe");
			String remark = customer.getRemarks();
			System.out.println("Loan rejected! Your details were found in Dedupe");
		}
		else
		{
			System.out.println("Check Done");
		}
		
		System.out.println();
		System.out.println("Move forward to scoring...press 1");
		int l = obj.nextInt();
		if(l==1)
		{
			Scoring(customer);
		}

			}
	
	
	// Is negative function to  calculate the negative score of a blacklisted person

	
	public int isNegative(ICustomer customer , Customer neg)
	{
		int negscore=0;
		if(customer.getInfo().getAadharCard().equals(neg.getInfo().getAadharCard()))
		{
			negscore=negscore+30;
		}
		if(customer.getInfo().getPanCard().equals(neg.getInfo().getPanCard()))
		{
			negscore=negscore+30;
		}
		
		return negscore;
	}
	
	
	//If the person is clean , then an income score is calculated. If the score is good then user is granted the loan otherwise not 
	
	public void Scoring(ICustomer customer)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Scoring");
		int points=0;
		if(customer.getLinfo().getTotalincome()>=100000)
		{
			System.out.println("You get 100 points on income score");
			points=points+100;
		}
		else if(customer.getLinfo().getTotalincome()<80000&& customer.getLinfo().getTotalincome()>40000)
		{
			System.out.println("you get 50 points for income score");
			points=points+50;
		}
		else if(customer.getLinfo().getTotalincome()>10000)
		{
			System.out.println("you get 0 points for income score");
		}
		
		if(customer.getInfo().getAge()>=21&&customer.getInfo().getAge()<=40)
		{
			System.out.println("you get 50 points for age");
			points=points+50;
		}
		
		System.out.println("Your total points are : "+points);
		customer.getLinfo().setIncm_score(points);
		
		if(customer.getLinfo().getIncm_score()>=50)
		{
			System.out.println("You are eligible for the loan");
			System.out.println("Do you want to finally take the loan(1/0)");
			int a = obj.nextInt();
			
			if(a==1)
			{
				System.out.println("Loan being processed.....");
				
				System.out.println();
			}
			else
			{
				System.out.println("Customer rejects the loan....Exiting");
			}
		}
	}
	
	

	
}