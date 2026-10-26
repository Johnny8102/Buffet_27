/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		 System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println ("3. The slot machine will roll 3 numbers from 1 to 10."); 
	System.out.println ("a. If two numbers match, you double your money.");
	System.out.println("b. If three numbers match, you triple your money.");
	System.out.println("c. If none match, you lose your money.");               
	System.out.println("-----------------------------------------------------------------------------");
       

	   int a = 100;
			
	    while (true) {
		
		System.out.println("would you like to play, type yes or y to play and no or n to opt out");
		String option = sc.next();
		if (option.equals ("No")||option.equals ("no")||option.equals ("N")||option.equals ("n")) {
			System.out.println ("you opted out have a nice day.");
			System.out.println("you were left with " + a + "$"); 
			break;
		}
		if (option.equals ("Yes")|| option.equals ("yes")|| option.equals ("y")|| option.equals ("Y")){



			System.out.println("How much would you like to wager");
			int wager = sc.nextInt();
			
			int tw = a-wager;
			int x = (int)(Math.random()*9)+0;
			int y = (int)(Math.random()*9)+0;
			int z = (int)(Math.random()*9)+0;
			System.out.println("great these are your numbers");
			System.out.println("______________");
			System.out.println("| " + x + " | " + y + " | " + z + " |");
			System.out.println("______________");
			if ((x==y)&&(x==z)){
				System.out.println("JACKPOT!!!!!!!! your wager has now been tripled");
                a = tw+wager*3;
				System.out.println("you now have: " + a);
			}
			else if (x==y){
				System.out.println("you won your wager has now been doubled");
                a = tw+wager*2;
				System.out.println("you now have: " + a);
			}
			
			
			else if (x==z){
				System.out.println("you won your wager has now been doubled");
                a = tw+wager*2;
                System.out.println("you now have: " + a);
				
			}
			else if (y==z){
				System.out.println("you won your wager has now been doubled");
                a = tw+wager*2;
                System.out.println("you now have: " + a);
				
			}
			
			else if ((x!=y)&&(x!=z)&&(y!=z)){
				System.out.println("Didn't win this time, better luck next time!");
				a = tw;
               System.out.println("you now have: " + a); 
			}
			
			
			
		  if (a==0){
			System.out.println("Sorry you have no more money");
			break;
		  }
		}
			
}






	}
	}