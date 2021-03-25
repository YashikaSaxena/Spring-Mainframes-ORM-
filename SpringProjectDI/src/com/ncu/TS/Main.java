package com.ncu.TS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		TextEditor te=(TextEditor)ac.getBean("texteditor");
		te.spellchecker();

	}

}
