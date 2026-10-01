/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Hello! This is a number guessing game guess a number from 1-1000 put in a number");
		String number = sc.nextLine ();
		int numgen = (int)(Math.random()*1001)+0;
		if (number.equals(numgen)){
			System.out.println("Good job! you guessed it right the number is " + numgen);
		
		}
		else{
			System.out.println ("Nice try! but the number is " + numgen);
		}

		
		

		

		
	}
}
