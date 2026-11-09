/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Black Jack rules:");
		System.out.println("1. Each player starts with $100.");
		 System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println ("3. You will start off with 2 cards that have a specific value on them."); 
	System.out.println ("a. you have to be the closest to 21 against ur opponent");
	System.out.println("b. after you get your two cards you chose whether to hit and get a new card that will add more value or stand");
	System.out.println("c. If you aren't the closest, or go over 21 you lose");               
	System.out.println("-----------------------------------------------------------------------------");
       

	   int c = 100;
			
	    while (true) {
		
		System.out.println("would you like to play, type yes or y to play and no or n to opt out");
		String option = sc.next();
		if (option.equals ("No")||option.equals ("no")||option.equals ("N")||option.equals ("n")) {
			System.out.println ("you opted out have a nice day.");
			System.out.println("you were left with " + c + "$"); 
			break;
		}
		if (option.equals ("Yes")|| option.equals ("yes")|| option.equals ("y")|| option.equals ("Y")){



			System.out.println("How much would you like to wager");
			int wager = sc.nextInt();
			
			int tw = c-wager;
			int x = (int)(Math.random()*10)+1;
			int y = (int)(Math.random()*10)+1;
			int z = (int)(Math.random()*4)+0;
			int a = (int)(Math.random()*10)+1;
			int b = (int)(Math.random()*10)+1;
			int d = (int)(Math.random()*10)+1;
			int e = (int)(Math.random()*10)+1;

			System.out.println("great these are your cards");
			if (x==1){
				System.out.println("+-------+");
				System.out.println("| A     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     A |");
				System.out.println("+-------+");
				System.out.println("would u like the value to be 1 or 11");
				int ace = sc.nextInt();
				if (ace == 11){
					x=11;

				}
				if(ace==1){
					x=1;
				}
				
				}
				if (x==2){
				System.out.println("+-------+");
				System.out.println("| 2     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     2 |");
				System.out.println("+-------+");
				
				}

				if (x==3){
				System.out.println("+-------+");
				System.out.println("| 3     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     3 |");
				System.out.println("+-------+");
				
				}
				if (x==4){
				System.out.println("+-------+");
				System.out.println("| 4     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     4 |");
				System.out.println("+-------+");
				
				}
				if (x==5){
				System.out.println("+-------+");
				System.out.println("| 5     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     5 |");
				System.out.println("+-------+");
				
				}

				if (x==6){
				System.out.println("+-------+");
				System.out.println("| 6     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     6 |");
				System.out.println("+-------+");
				
				}
				if (x==7){
				System.out.println("+-------+");
				System.out.println("| 7     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     7 |");
				System.out.println("+-------+");
				
				}
				if (x==8){
				System.out.println("+-------+");
				System.out.println("| 8     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     8 |");
				System.out.println("+-------+");
				
				}
				if (x==9){
				System.out.println("+-------+");
				System.out.println("| 9     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     9 |");
				System.out.println("+-------+");
				
				}
				if ((x==10)&&(z==0)){
				System.out.println("+-------+");
				System.out.println("| 10     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     10 |");
				System.out.println("+-------+");
				
				}

				if ((x==10)&&(z==1)){
				System.out.println("+-------+");
				System.out.println("| K     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     K |");
				System.out.println("+-------+");
				
				}

				if ((x==10)&&(z==2)){
				System.out.println("+-------+");
				System.out.println("| Q     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     Q |");
				System.out.println("+-------+");
				
				}
				if ((x==10)&&(z==3)){
				System.out.println("+-------+");
				System.out.println("| J     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     J |");
				System.out.println("+-------+");
				
				}















			
			if (y==1){
				System.out.println("+-------+");
				System.out.println("| A     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     A |");
				System.out.println("+-------+");
				System.out.println("would u like the value to be 1 or 11");
				int ace = sc.nextInt();
				if (ace == 11){
					y=11;
				}
				if(ace==1){
					y=1;
				}
				
				}
				if (y==2){
				System.out.println("+-------+");
				System.out.println("| 2     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     2 |");
				System.out.println("+-------+");
				
				}

				if (y==3){
				System.out.println("+-------+");
				System.out.println("| 3     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     3 |");
				System.out.println("+-------+");
				
				}
				if (y==4){
				System.out.println("+-------+");
				System.out.println("| 4     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     4 |");
				System.out.println("+-------+");
				
				}
				if (y==5){
				System.out.println("+-------+");
				System.out.println("| 5     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     5 |");
				System.out.println("+-------+");
				
				}

				if (y==6){
				System.out.println("+-------+");
				System.out.println("| 6     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     6 |");
				System.out.println("+-------+");
				
				}
				if (y==7){
				System.out.println("+-------+");
				System.out.println("| 7     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     7 |");
				System.out.println("+-------+");
				
				}
				if (y==8){
				System.out.println("+-------+");
				System.out.println("| 8     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     8 |");
				System.out.println("+-------+");
				
				}
				if (y==9){
				System.out.println("+-------+");
				System.out.println("| 9     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     9 |");
				System.out.println("+-------+");
				
				}
				if ((y==10)&&(z==0)){
				System.out.println("+-------+");
				System.out.println("| 10     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     10 |");
				System.out.println("+-------+");
				
				}

				if ((y==10)&&(z==1)){
				System.out.println("+-------+");
				System.out.println("| K     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     K |");
				System.out.println("+-------+");
				
				}

				if ((y==10)&&(z==2)){
				System.out.println("+-------+");
				System.out.println("| Q     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     Q |");
				System.out.println("+-------+");
				
				}
				if ((y==10)&&(z==3)){
				System.out.println("+-------+");
				System.out.println("| J     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     J |");
				System.out.println("+-------+");
				
				}


         System.out.println("Now your opponents cards");






				if (a==1){
				System.out.println("+-------+");
				System.out.println("| A     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     A |");
				System.out.println("+-------+");
				System.out.println("would u like the value to be 1 or 11");
				int ace = sc.nextInt();
				if (ace == 11){
					a=11;

				}
				if(ace==1){
					a=1;
				}
				
				}
				if (a==2){
				System.out.println("+-------+");
				System.out.println("| 2     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     2 |");
				System.out.println("+-------+");
				
				}

				if (a==3){
				System.out.println("+-------+");
				System.out.println("| 3     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     3 |");
				System.out.println("+-------+");
				
				}
				if (a==4){
				System.out.println("+-------+");
				System.out.println("| 4     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     4 |");
				System.out.println("+-------+");
				
				}
				if (a==5){
				System.out.println("+-------+");
				System.out.println("| 5     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     5 |");
				System.out.println("+-------+");
				
				}

				if (a==6){
				System.out.println("+-------+");
				System.out.println("| 6     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     6 |");
				System.out.println("+-------+");
				
				}
				if (a==7){
				System.out.println("+-------+");
				System.out.println("| 7     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     7 |");
				System.out.println("+-------+");
				
				}
				if (a==8){
				System.out.println("+-------+");
				System.out.println("| 8     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     8 |");
				System.out.println("+-------+");
				
				}
				if (a==9){
				System.out.println("+-------+");
				System.out.println("| 9     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     9 |");
				System.out.println("+-------+");
				
				}
				if ((a==10)&&(z==0)){
				System.out.println("+-------+");
				System.out.println("| 10     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     10 |");
				System.out.println("+-------+");
				
				}

				if ((a==10)&&(z==1)){
				System.out.println("+-------+");
				System.out.println("| K     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     K |");
				System.out.println("+-------+");
				
				}

				if ((a==10)&&(z==2)){
				System.out.println("+-------+");
				System.out.println("| Q     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     Q |");
				System.out.println("+-------+");
				
				}
				if ((a==10)&&(z==3)){
				System.out.println("+-------+");
				System.out.println("| J     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     J |");
				System.out.println("+-------+");
				
				}















			
			if (b==1){
				System.out.println("+-------+");
				System.out.println("| A     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     A |");
				System.out.println("+-------+");
				System.out.println("would u like the value to be 1 or 11");
				int ace = sc.nextInt();
				if (ace == 11){
					b=11;
				}
				if(ace==1){
					b=1;
				}
				
				}
				if (b==2){
				System.out.println("+-------+");
				System.out.println("| 2     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     2 |");
				System.out.println("+-------+");
				
				}

				if (b==3){
				System.out.println("+-------+");
				System.out.println("| 3     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     3 |");
				System.out.println("+-------+");
				
				}
				if (b==4){
				System.out.println("+-------+");
				System.out.println("| 4     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     4 |");
				System.out.println("+-------+");
				
				}
				if (b==5){
				System.out.println("+-------+");
				System.out.println("| 5     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     5 |");
				System.out.println("+-------+");
				
				}

				if (b==6){
				System.out.println("+-------+");
				System.out.println("| 6     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     6 |");
				System.out.println("+-------+");
				
				}
				if (b==7){
				System.out.println("+-------+");
				System.out.println("| 7     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     7 |");
				System.out.println("+-------+");
				
				}
				if (b==8){
				System.out.println("+-------+");
				System.out.println("| 8     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     8 |");
				System.out.println("+-------+");
				
				}
				if (b==9){
				System.out.println("+-------+");
				System.out.println("| 9     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     9 |");
				System.out.println("+-------+");
				
				}
				if ((b==10)&&(z==0)){
				System.out.println("+-------+");
				System.out.println("| 10     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     10 |");
				System.out.println("+-------+");
				
				}

				if ((b==10)&&(z==1)){
				System.out.println("+-------+");
				System.out.println("| K     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     K |");
				System.out.println("+-------+");
				
				}

				if ((b==10)&&(z==2)){
				System.out.println("+-------+");
				System.out.println("| Q     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     Q |");
				System.out.println("+-------+");
				
				}
				if ((b==10)&&(z==3)){
				System.out.println("+-------+");
				System.out.println("| J     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     J |");
				System.out.println("+-------+");
				
				}

			int cvp = (x+y);
			int cva = (a+b);
				System.out.print("1st player your total is " + cvp + " would you like to hit or stand?");
				String hs = sc.next();
				if(hs.equals("stand")||hs.equals("Stand")){
					System.out.println("ok you have decided to stand your total is " + cvp);
				}
				if(hs.equals("hit")||hs.equals("Hit")){
					System.out.println("great job you hit and your card is");





					if (d==1){
				System.out.println("+-------+");
				System.out.println("| A     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     A |");
				System.out.println("+-------+");
				System.out.println("would u like the value to be 1 or 11");
				int ace = sc.nextInt();
				if (ace == 11){
					d=11;

				}
				if(ace==1){
					d=1;
				}
				
				}
				if (d==2){
				System.out.println("+-------+");
				System.out.println("| 2     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     2 |");
				System.out.println("+-------+");
				
				}

				if (d==3){
				System.out.println("+-------+");
				System.out.println("| 3     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     3 |");
				System.out.println("+-------+");
				
				}
				if (d==4){
				System.out.println("+-------+");
				System.out.println("| 4     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     4 |");
				System.out.println("+-------+");
				
				}
				if (d==5){
				System.out.println("+-------+");
				System.out.println("| 5     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     5 |");
				System.out.println("+-------+");
				
				}

				if (d==6){
				System.out.println("+-------+");
				System.out.println("| 6     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     6 |");
				System.out.println("+-------+");
				
				}
				if (d==7){
				System.out.println("+-------+");
				System.out.println("| 7     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     7 |");
				System.out.println("+-------+");
				
				}
				if (d==8){
				System.out.println("+-------+");
				System.out.println("| 8     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     8 |");
				System.out.println("+-------+");
				
				}
				if (d==9){
				System.out.println("+-------+");
				System.out.println("| 9     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     9 |");
				System.out.println("+-------+");
				
				}
				if ((d==10)&&(z==0)){
				System.out.println("+-------+");
				System.out.println("| 10     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     10 |");
				System.out.println("+-------+");
				
				}

				if ((d==10)&&(z==1)){
				System.out.println("+-------+");
				System.out.println("| K     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     K |");
				System.out.println("+-------+");
				
				}

				if ((d==10)&&(z==2)){
				System.out.println("+-------+");
				System.out.println("| Q     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     Q |");
				System.out.println("+-------+");
				
				}
				if ((d==10)&&(z==3)){
				System.out.println("+-------+");
				System.out.println("| J     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     J |");
				System.out.println("+-------+");
				cvp=cvp+d;
				}


				}

				System.out.println("Opponent, you have " + cva + " it is now your turn would you like to hit or stand");


                        String hs2 = sc.next();
				if(hs2.equals("stand")||hs2.equals("Stand")){
					System.out.println("ok you have decided to stand your total is " + cva);
				}
				if(hs2.equals("hit")||hs2.equals("Hit")){
					System.out.println("great job you hit and your card is");





					if (e==1){
				System.out.println("+-------+");
				System.out.println("| A     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     A |");
				System.out.println("+-------+");
				System.out.println("would u like the value to be 1 or 11");
				int ace = sc.nextInt();
				if (ace == 11){
					e=11;

				}
				if(ace==1){
					e=1;
				}
				
				}
				if (e==2){
				System.out.println("+-------+");
				System.out.println("| 2     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     2 |");
				System.out.println("+-------+");
				
				}

				if (e==3){
				System.out.println("+-------+");
				System.out.println("| 3     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     3 |");
				System.out.println("+-------+");
				
				}
				if (e==4){
				System.out.println("+-------+");
				System.out.println("| 4     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     4 |");
				System.out.println("+-------+");
				
				}
				if (e==5){
				System.out.println("+-------+");
				System.out.println("| 5     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     5 |");
				System.out.println("+-------+");
				
				}

				if (e==6){
				System.out.println("+-------+");
				System.out.println("| 6     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     6 |");
				System.out.println("+-------+");
				
				}
				if (e==7){
				System.out.println("+-------+");
				System.out.println("| 7     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     7 |");
				System.out.println("+-------+");
				
				}
				if (e==8){
				System.out.println("+-------+");
				System.out.println("| 8     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     8 |");
				System.out.println("+-------+");
				
				}
				if (e==9){
				System.out.println("+-------+");
				System.out.println("| 9     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     9 |");
				System.out.println("+-------+");
				
				}
				if ((e==10)&&(z==0)){
				System.out.println("+-------+");
				System.out.println("| 10     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     10 |");
				System.out.println("+-------+");
				
				}

				if ((e==10)&&(z==1)){
				System.out.println("+-------+");
				System.out.println("| K     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     K |");
				System.out.println("+-------+");
				
				}

				if ((e==10)&&(z==2)){
				System.out.println("+-------+");
				System.out.println("| Q     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     Q |");
				System.out.println("+-------+");
				
				}
				if ((e==10)&&(z==3)){
				System.out.println("+-------+");
				System.out.println("| J     |");
				System.out.println("|       |");
				System.out.println("|   ♠   |");
				System.out.println("|       |");
				System.out.println("|     J |");
				System.out.println("+-------+");
				
				}
               cva=cva+e;

				}









			
			
			
			
			
			
			
			
			
			
			
			
			else if ((cvp<=21)&&(cvp>cva)){
				System.out.println("player 1 has won, your wager has now been doubled");
                c = tw+wager*2;
                System.out.println("you now have: " + c);
				
			}
			else if ((cva<=21)&&(cva>cvp)){
				System.out.println("player 2 has won, you lost money");
                c = tw;
                System.out.println("you now have: " + c);
				
			}
			
			
			
			
			
		  if (c==0){
			System.out.println("Sorry you have no more money");
			break;
		  }
		}
			
}


















		BaseClass test = new BaseClass();


		
	}
}
