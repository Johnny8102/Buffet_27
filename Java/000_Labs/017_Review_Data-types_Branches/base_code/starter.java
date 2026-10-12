/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
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
		
		else {
			System.out.println ("thats not a option, try again!");
		}
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, and Charisma. Spend them wisely.");
		int total = (20);
		System.out.println (" Strength (1-10):");
		int strength = sc.nextInt();
		if (strength>10){
			System.out.println("Please input a smaller value. Strength (1-10):");
			int strength2 = sc.nextInt();
			strength = strength2;
		}
		int st = (total-strength);
        System.out.println("You have: " + st + " points");
		System.out.println (" Dexterity (1-10):");
		int dext = sc.nextInt();
		if (dext>10){
			System.out.println("Please input a smaller value. dext (1-10):");
			int dext2 = sc.nextInt();
			dext = dext2;
		}
		
		if (st<dext){
         System.out.println("you don't have enough points for that try again");
		}
		int dt = (st - dext);
        System.out.println("You have: " + dt + " points");
		
		System.out.println (" Intelligence (1-10):");
		int intel = sc.nextInt();
            if (intel>10){
			System.out.println("Please input a smaller value. intel (1-10):");
			int intel2 = sc.nextInt();
			intel = intel2;
		}
		if (dt<intel){
         System.out.println("you don't have enough points for that try again");
		}
		int it = (dt - intel);
        System.out.println("You have: " + it + " points");

		System.out.println (" Constitution (1-10):");
		int con = sc.nextInt();
		if (con>10){
			System.out.println("Please input a smaller value. Strength (1-10):");
			int con2 = sc.nextInt();
			con = con2;
		}
		if (it<con){
         System.out.println("you don't have enough points for that try again");
		}
		int ct = (it - con);
        System.out.println("You have: " + ct + " points");

		System.out.println (" Charisma (1-10):");
		int cha = sc.nextInt();
		if (cha>10){
			System.out.println("Please input a smaller value. Strength (1-10):");
			int cha2 = sc.nextInt();
			cha = cha2;
		}
		if (ct<cha){
         System.out.println("you don't have enough points for that try again");
		}
		int cht = (ct - cha);
        System.out.println("You have: " + cht + " points");
		
		System.out.println("----------------------------------------------------");
		System.out.println("You are " + name + ", the " + title);
		System.out.println("You're a " + character +" with the following stats ");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dext);
		System.out.println("Intelligence - " + intel);
		System.out.println("Constitution - " + con);
        System.out.println("Charisma - " + cha);



	}
}
