package com.ncu.coll_constructor;

import java.util.*;

public class Customer {
	private List<String> names=new Vector<String>();
	private Set<Long> Phno;
	private Map<Long, String> aadharNo;
	private Map<Long, Address> address;
	private Properties email;
	
	public Customer(List<String> names,Set<Long> Phno,Map<Long, String> aadharNo, Properties email) {
		this.names=names;
		this.Phno=Phno;
		this.aadharNo=aadharNo;
		this.email=email;
		
		}

	
	public String toString() {
		return "Customer [names=" + names + ", Phno=" + Phno + ", aadharNo=" + aadharNo +", Email= "+email+  "]";
	}

}
