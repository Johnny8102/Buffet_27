/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int num1 = (5);
		int num2 = (20);
		int num3 = (15);
		if((num1 > num2) && (num1 > num3)){
			System.out.print("The greatest number is: " + num1 + " and ");
		}
		
		if((num2 > num1) && (num2 > num3)){
			System.out.print("The greatest number is: " + num2 + " and ");
		}
		
		if((num3 > num1) && (num3 > num2)){
			System.out.print("The greatest number is: " + num3 +" and ");
		}



		if((num1 < num2) && (num1 < num3)){
			System.out.println("The smallest number is: " + num1);
		}
		
		if((num2 < num1) && (num2 < num3)){
			System.out.println("The smallest number is: " + num2);
		}
		
		if((num3 < num1) && (num3 < num2)){
			System.out.println("The smallest number is: " + num3);
		}
		
		

	}

}