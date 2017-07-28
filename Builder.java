package com.certification;

public class Builder {
 private String brand;
 private boolean empty;
 public static void main(String[] args) {
 Builder wb = new Builder();
 System.out.print("Empty = " + wb.empty);
 System.out.print(", Brand = " + wb.brand);
 } }
