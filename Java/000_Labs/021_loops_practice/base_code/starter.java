/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a guessing game. Guess a number from 1-1000");
		String s = new String ("Guess a number from 1-1000");
        int y = sc.nextInt();
		int x = 5;
	
			if(y==x){
				
            System.out.println("You guessed the right number");
			
		}
		while(y!=x){
				
            System.out.println("try again,Guess a number from 1-1000");
			int yy = sc.nextInt();
		   int xx = 5;
		   if (yy == xx){
			
    System.out.println("you got it");
	break;
	}
		  
		}
		
	
		   
		
		
		
	
	
	
	
	
	}
}
