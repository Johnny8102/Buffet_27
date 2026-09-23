/*
 *	Author:Johnny Ghevondyan
 *  Date:9/22/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int num1 = (int) (Math.random()*255)+0;
        int num2 = (int) (Math.random()*255)+0;
        int num3 = (int) (Math.random()*255)+0;
        System.out.println("Random color: rgb " + num1 + ", " + num2 + ", " + num3 + " Complementary Color: rgb " + num1 + ", " + num2 + ", " + num3);
        getColor(num1,num2,num3);
        int numcomp1 = (255-num1);
        int numcomp2 = (255-num2);
        int numcomp3 = (255-num3);
        getColor(numcomp1,numcomp2,numcomp3);
        System.out.println("triadic colors");
        getColor(num1,num2,num3);
        getColor(num3,num1,num2);
        getColor(num2,num3,num1);
        int dark1 = (int) (Math.random()*128)+0;
        int dark2 = (int) (Math.random()*128)+0;
        int dark3 = (int) (Math.random()*128)+0;
        System.out.println("dark color");
        getColor(dark1,dark2,dark3);
        System.out.println("light color");
        int light1 = (int) (Math.random()*128)+128;
        int light2 = (int) (Math.random()*128)+128;
        int light3 = (int) (Math.random()*128)+128;
        getColor(light1,light2,light3);
        





        


		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        

    }
}
