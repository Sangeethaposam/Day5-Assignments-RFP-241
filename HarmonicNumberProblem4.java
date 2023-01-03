package com.bridzelabz.BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumberProblem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
			System.out.println("enter a number :");
				int num=sc.nextInt();
				double result=0;
				double sum=0;
				for(int i=num;i>0;i--) {
					result=(double)1/i;
					System.out.println(result);
					sum=sum+result;
				}
				System.out.println("print result: " + result);
				System.out.println("print sum : " + sum);
		}
			
	}


