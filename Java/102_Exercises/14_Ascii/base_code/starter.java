/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Ascii Musuem! Please select what exhibit you would like to view");
		System.out.println("1. birds 2. nature 3. plants");
		String exhibit = sc.nextLine();
		if (exhibit.equals("birds")){
			System.out.println("Which piece would you like");
			System.out.println("duck");
			System.out.println("penguin");
			String piece = sc.nextLine();
			if (piece.equals("duck")){
				System.out.println(">o)");
				System.out.println("(_>");
				}
			if (piece.equals("penguin")){
				System.out.println(" __");
				System.out.println("( o>");
				System.out.println("///\\");
				System.out.println("\\V_/_");
			}
			
		}
		else if (exhibit.equals("nature")){
			System.out.println("Which piece would you like");
			System.out.println("clouds");
			System.out.println("sun");
			String piece2 = sc.nextLine();
			if (piece2.equals("sun")){
				System.out.println("    |");
				System.out.println("  \\ | /");
				System.out.println("   \\*/");
				System.out.println("--**O**--");
				System.out.println("   /*\\");
				System.out.println("  / | \\");
				System.out.println("    |");
			}
			if (piece2.equals("clouds")){
				System.out.println("   __   _");
				System.out.println(" _(  )_( )_");
				System.out.println("(_   _    _)");
				System.out.println("  (_) (__)");
			}


		}
		else if (exhibit.equals("plants")){
			System.out.println("Which piece would you like");
			System.out.println("cactus");
			System.out.println("flower");	
			String piece3 = sc.nextLine();
			if (piece3.equals("cactus")){

				System.out.println ("  |");
				System.out.println ("(_|_)");
				System.out.println ("  |");
			
			}
			if (piece3.equals("flower")){
				System.out.println (" _,-._");
				System.out.println ("/ \\_/ \\");
				System.out.println (">-(_)-<");
				System.out.println ("\\_/ \\_/");
				System.out.println ("  `-'");
			}

		}
		else{
			System.out.println ("sorry but the ascii musuem has closed. Thank you for visting!");
		}


		
		
	}
}
