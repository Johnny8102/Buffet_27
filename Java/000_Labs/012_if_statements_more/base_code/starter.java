/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Input your first number: ");
		int num1 = sc.nextInt ();
		System.out.println("Please input your second number");
		int num2 = sc.nextInt ();

		boolean a = (num1!=num2);
		if(a){
         System.out.println ("The variables are different");
	}
	
	boolean b = (num1==num2);
	if(b){
		System.out.println (" The variables are the same");
	}
		
	}
}
