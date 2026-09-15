/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Johnnys in-n-out, Heres our menu.");
        double b = (5.50);
        double f = (2.50);
        double s = (2);
        System.out.println("Burgers: " + b + "$");
        System.out.println("Fries: " + f + "$");
        System.out.println("Soda: " + s + "$");
        System.out.println("How many burgers would you like?");
        int burgerquant = sc.nextInt();
        System.out.println("How many fries would you like?");
        int friesquant = sc.nextInt();
        System.out.println("How many sodas would you like?");
        int sodaquant = sc.nextInt();
        System.out.println ("Here is your receipt");
        double burgertotal = (burgerquant*b);


        
	}
}
