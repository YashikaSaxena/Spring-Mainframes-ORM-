package com.ncu.circularBeanScope;

public class B {
	private C c;
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	B() {
		System.out.println("Cons B call");
	}

}
