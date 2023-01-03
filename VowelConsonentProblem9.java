package com.bridzelabz.BasicCorePrograms;

public class VowelConsonentProblem9 {
	public static void main(String[] args) {
	char ch='d';
	//using if statement
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		System.out.println(ch + " is a vowel");
	}
	else {
		System.out.println(ch + " is a consonent");
	}
	
	char x = 'o';
	//using switch statement
	switch(x) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println( x + " is a vowel");
		break;
	default :
		System.out.println(x + " is a consonent");
	}
 }
}
