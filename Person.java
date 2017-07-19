package com.bavi;

class Person{
	static int pid;
    int age;
    String name;
    
  Person(String s,int i ){
      ++pid;
      name=s;
      age=i;
      }
     
}
