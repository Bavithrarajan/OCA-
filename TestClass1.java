package com.balaji;
public class TestClass1 {
	   public static void main(String[] args) throws Exception  {
	       Game g = new Soccer();
	       // 1
	       g.play();  //1   //2
	       Soccer s = (Soccer) g;
	       // 2
	       s.play("cosco"); 
	   }
	}

