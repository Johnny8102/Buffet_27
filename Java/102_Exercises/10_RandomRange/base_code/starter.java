/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Please enter 2 numbers to create a range for your random numbers");
		System.out.println ("please enter a integer:");
		int num1 = sc.nextInt();
		System.out.println("please enter another intger bigger than the first:");
		int num2 = sc.nextInt();
		System.out.println("Your range is " + num1 + "-" + num2);
		System.out.println(" Here are 5 numbers generated in that range.");
		int x = (int) (Math.random()*num2-num1)+num1;
		int y = (int) (Math.random()*num2-num1)+num1;
		int z = (int) (Math.random()*num2-num1)+num1;
		int a = (int) (Math.random()*num2-num1)+num1;
		int b = (int) (Math.random()*num2-num1)+num1;
		System.out.print(x + ", ");
		System.out.print(y + ", ");
		System.out.print(z + ", ");
		System.out.print(a + ", ");
		System.out.print(b);
		

		
		

	}
}
