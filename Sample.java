package com.handling;

public class Sample {
public static void main(String[] args) {
	try{
		int a[]=new int[5];
		a[6]=20;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			}
System.out.println("handled the Exception");
}
}
