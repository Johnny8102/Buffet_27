/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter a width: ");
		int width = sc.nextInt();
		System.out.println("Enter a height");
		int height = sc.nextInt();
		String y = new String ("*");
		int count1 = 0;
		int count2 = 0;
		int total = (height*width);
		while (count2<height){
				count1 = 0;
			    while(count1<width){
				System.out.print("*");
				count1++;
			}
			System.out.println();
				count2++;
		}   
			
		
	}
}
