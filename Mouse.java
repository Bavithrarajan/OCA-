package com.bavi;
public class Mouse{
/*public class Mouse {
	private int numTeeth;
	 private int numWhiskers;
	 private int weight;
	 public Mouse(int weight) {
	 this(weight, 16); // calls constructor with 2 parameters
	 }
	 public Mouse(int weight, int numTeeth) {
	 this(weight, numTeeth, 6); // calls constructor with 3 parameters
	 }
	 public Mouse(int weight, int numTeeth, int numWhiskers) {
	 this.weight = weight;
	 this.numTeeth = numTeeth;
	 this.numWhiskers = numWhiskers;
	 }
	 public void print() {
	 System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	 }
	 public static void main(String[] args) {
	 Mouse mouse = new Mouse(15);
	 mouse.print();
	 }
	}*/
private int weight;
private int height;	
	public Mouse(int weight){
		this(weight,20);
	}
	
	public Mouse(int weight,int height){
		this.weight=weight;
		this.height=height;
	}
	public void print(){
		System.out.println(weight+" "+height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mouse m = new Mouse(12);
m.print();
	}

}
