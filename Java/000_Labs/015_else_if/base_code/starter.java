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
		int number = sc.nextInt ();
		int numgen = (int)(Math.random()*1001)+0;
		if (number==numgen){
			System.out.println("Good job! you guessed it right the number is " + numgen);
		
		}
		else if(number<numgen){
			System.out.println("Try again the number is greater than what you said");
			int num2 = sc.nextInt();
		}
		else if (number>numgen){
			System.out.println("Try again the number is less than what you said");
			int num3 = sc.nextInt();
		}
		
		System.out.println ("Sorry you failed but try again!");
	}
}
