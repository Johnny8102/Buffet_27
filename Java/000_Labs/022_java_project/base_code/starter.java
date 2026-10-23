/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Slot Machine Rules: 1. Each player starts with $100. 2. Input a wager less than your total amount of money. 3. The slot machine will roll 3 numbers from 1 to 10.  a. If two numbers match, you double your money.    b. If three numbers match, you triple your money.   c. If none match, you lose your money.                ---------------------------------------------------------------------------------------------");
        System.out.println("would you like to play, type yes or y to play and no or n to opt out");
		String option = sc.nextLine();
		if (option.equals ("No")||option.equals ("no")||option.equals ("N")||option.equals ("n")) {
			System.out.println ("you opted out have a nice day");
		}

while (option.equals ("Yes")|| option.equals ("yes")|| option.equals ("y")|| option.equals ("Y")) {
int a = 100;
			
			System.out.println("How much would you like to wager");
			int wager = sc.nextInt();
			
			int tw = a-wager;
			int x = (int)(Math.random()*1)+0;
			int y = (int)(Math.random()*1)+0;
			int z = (int)(Math.random()*1)+0;
			System.out.println("great these are your numbers");
			System.out.println("______________");
			System.out.println("| " + x + " | " + y + " | " + z + " |");
			System.out.println("______________");
			if ((x==y)&&(x==z)){
				System.out.println("JACKPOT!!!!!!!! your wager has now been tripled");
                System.out.println(tw+wager*3);
			}
			else if (x==y){
				System.out.println("you won your wager has now been doubled");
                System.out.println(tw+wager*2);
			}
			else if (x==z){
				System.out.println("you won your wager has now been doubled");
                System.out.println(tw+wager*2);
			}
			
			if ((x!=y)||(x!=z)){
				System.out.print("Didn't win this time, better luck next time!");
			}
			
			
		
			
			
}


System.out.println("would you like to try again");
			String option2 = sc.nextLine();
			
			
			if (option2.equals ("No")||option2.equals ("no")||option2.equals ("N")||option2.equals ("n")) {
			break;

			}


			
	}
	}