package com.bridzelabz.FunctionalProgram;

public class WindChill {

	public static void main(String[] args) {
		
		Double t=Double.valueOf(args[0]);
		Double v=Double.valueOf(args[1]);
		if(t>50)
		 {
			if( 120<v)
			{
				if(3>v) {
					 System.out.println("Not Chill");
					
				}
			
			}
			 
		 }
		else {
			 double w=35.74+0.6215*t+(0.4275*t-35.75)* Math.pow(v,0.16 );
			 System.out.println(w);
			 
			 System.out.println("wind chill");
		}
	}

}
