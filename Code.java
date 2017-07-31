package com.balaji;

import java.util.function.Predicate;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(test());
		System.out.println(test(i->i==5));
	}
private static boolean test(Predicate<Integer> p){
return p.test(5);

}
}
