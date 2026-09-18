/*
 *	Author:Johnny Ghevondyan
 *  Date:9/15/26
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		double number = sc.nextDouble();
		System.out.println("Here are the next 5 numbers");
		System.out.print (number + ", ");
		System.out.print(number+1 + ", ");
		System.out.print(number+2 + ", ");
		System.out.print(number+3 + ", ");
		System.out.print(number+4 + ", ");
		System.out.println(number+5 + ", ");
		System.out.println ("Here are the next 5 multiples");
		System.out.print (number+ ", ");
		System.out.print (number*number + ", ");
		System.out.print (number*number*number + ", ");
		System.out.print (number*number*number*number + ", ");
		System.out.print (number*number*number*number*number + ", ");
		System.out.println (number*number*number*number*number*number);
		System.out.println ("here is " + number + " divided by 100");
		System.out.println (number/100);
		System.out.println ("here is " + number + " divided by 10");
		System.out.print (number/10);









	}
}
