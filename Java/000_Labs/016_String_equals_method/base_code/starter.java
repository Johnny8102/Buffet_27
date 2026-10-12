/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String character = sc.nextLine ();
		if(character.equals("wizard") || character.equals("Wizard")){
		System.out.println ("You are a wizard!");	
		}
		else if(character.equals("warrior") || character.equals("Warrior")){
		System.out.println ("You are a warrior!");	
		}
		else if(character.equals("Rogue") || character.equals("rouge")){
		System.out.println ("You are a rouge!");	
		}
		
		else{
			System.out.println ("thats not a option, try again!");
		}
		
		
	}
}
