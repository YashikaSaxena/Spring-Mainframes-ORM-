package com.ncu.TC;

public class Manager {
	SmartWorker sw; 
	LazyWorker lw; 
	ExtraOrdinaryWorker ew; //add one more object 
	//modify constructor public 
	Manager(SmartWorker sw, LazyWorker lw,ExtraOrdinaryWorker ew) 
	{ 
	this.sw = sw; 
	this.lw = lw; 
	this.ew = ew;//add 
	} 
	public void ManageWork() { 
	sw.work(); 
	lw.work(); 
	ew.work();//make call 
	}
}
