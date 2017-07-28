package com.handling;

public class Moose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String type="cheese";
	Object obj=type;
	Integer number=(Integer)obj;
	}catch(ClassCastException e){
		System.out.println(e);
	}
	System.out.println("very tasty");
	}

}
