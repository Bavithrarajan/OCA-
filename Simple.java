package com.handling;

public class Simple {
public static void main(String[] args) {
try{
	int data=40/0;
}catch(ArithmeticException e){
System.out.println(e);}
System.out.println("read the message");
}}