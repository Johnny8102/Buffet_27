/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Whats your name");
		String name = sc.nextLine();
		System.out.println("how many times would you like me to print your name");
		int num = sc.nextInt();
		int x = 0;
		while(true){
			if(x==num){
				break;
			}
            System.out.println(name);
			x = x + 1;
			name = name + " ";
		}




		
	}
}
