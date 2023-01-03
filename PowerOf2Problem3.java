package com.bridzelabz.BasicCorePrograms;
import java.util.*;
public class PowerOf2Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base number :");
		int base = sc.nextInt();
		System.out.println("enter exponent number :");
		int exponent = sc.nextInt();
		int power=1;
		for(int i=1; i<=exponent;i++)
		{
			 power=power*base;
		}
			System.out.println(power);
			
		
	}

}
