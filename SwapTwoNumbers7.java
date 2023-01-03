package com.bridzelabz.BasicCorePrograms;

public class SwapTwoNumbers7 {

	public static void main(String[] args) {
		//using 3 variables
		int a=5;
		int b=4;
		int temp;
		System.out.println("before swapping :" +a+ " "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping:" +a+" "+b);
		//using 2 variables
		int x=3;
		int y=6;
		System.out.println("before swapping :" +x+ " "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping:" +x+" "+y);
	}

}
