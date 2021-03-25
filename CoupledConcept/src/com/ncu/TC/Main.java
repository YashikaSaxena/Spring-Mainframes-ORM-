package com.ncu.TC;

public class Main {

	public static void main(String[] args) {
		//Tightly Coupled
		SmartWorker sw = new SmartWorker(); 
		LazyWorker lw = new LazyWorker(); 
		ExtraOrdinaryWorker ew= new ExtraOrdinaryWorker();
		Manager mn = new Manager(sw, lw ,ew); 
		mn.ManageWork(); 
		

	}

}
