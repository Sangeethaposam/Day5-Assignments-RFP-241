package com.bridzelabz.BasicCorePrograms;

public class HeadAndTailProblem1 {

	public static void main(String[] args) {
		int head=0;
		int tail=0;
		int chances= 8;
		for(int i=1;i<=chances;i++) {
			double headCheck=Math.floor(Math.random()*10) %2;
		
			if(headCheck==0)
			{
				System.out.println("head:" + head);
				head++;
			}

			else
			{
				System.out.println("tail:" + tail);
				tail++;
				
			}
		}	
		
		int perc1=(head*100)/chances;
        int perc2=(tail*100)/chances;
        System.out.print("The percentage of getting head is:" + perc1);
          System.out.println("\n");
        System.out.print("The percentage of getting Tail is:" + perc2);
	}

}
