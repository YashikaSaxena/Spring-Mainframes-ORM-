package com.ncu.LC;

public class Main {

	public static void main(String[] args) {
		//Loose coupling using Interfaces
		/*Iworker sw = new SmartWorker(); //Upcasting 
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();*/
		Iworker sw = Factory.getObject() ;
		Manager mn = new Manager(sw); //passing smartworker object
		mn.ManageWork();
		}


	}

	


