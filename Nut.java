package com.handling;

public class Nut {
public static void main(String[] args) {
	try{
		String s=null;
	System.out.println(s.length());	
	}catch(NullPointerException e){
			System.out.println(e);
		}
System.out.println("Easy to create");
}
}
