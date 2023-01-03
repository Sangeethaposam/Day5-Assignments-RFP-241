package com.bridzelabz.BasicCorePrograms;
import java.util.*;
public class EvenorOddNumber8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if((num%2)==0)
		{
			System.out.println( num + " number is even ");
		}
		else
		{
			System.out.println( num + " number is odd "); 
		}
		
	}

}
