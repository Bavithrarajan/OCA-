package com.certification;

/*import java.util.ArrayList;
 import java.util.List;

 public class MyExamCloudOCAJP8{

 public static void main(String[] args){
 List<Integer> list = new ArrayList<>();
 list.add(1); 
 list.add(11);
 list.add(30); 
 list.add(9);
 list.removeIf(e -> e%2 != 0);
 System.out.println(list);
 }
 }*/
public class MyExamCloudOCAJP8{
 public static void main(String[] args){
 int x = 3;
 int y = ++x * 3 / x--+--x;

 System.out.println("y + x is " + (y + x));
 }
 }