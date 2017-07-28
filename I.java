package com.certification;
class I{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
			  for(int row = 1; row <=3; row++)
				 for(int col = 1; col <=2 ; col++) {
				 if(row * col % 2 == 0) continue ;
				 count++;
				 }
				 System.out.println(count);
				
	}}
