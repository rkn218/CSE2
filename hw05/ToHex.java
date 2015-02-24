// Rami Nasrallah
// 23/2/2015
// Space Exploration Java Program
// Program to show the timeline of space eplorations

import java.util.Scanner;

public class ToHex{
    public static void main(String[] args){
        Scanner color=new Scanner(System.in);
        
        int i=0;
        System.out.println("Please enter three numbers representing RGB values");
            while (!color.hasNextInt()){
            System.out.println("Sorry, your input must consist of integers.");
            System.exit(1);
            }
        int red = color.nextInt();
        int green = color.nextInt();
        int blue = color.nextInt();
        if (!(red >= 0 && red <= 255)){
             System.out.println("Sorry, you must enter values between 0-255");
             System.exit(1);}
        if (!(green >= 0 && green <= 255)){
             System.out.println("Sorry you must enter values between 0-255");
             System.exit(1);
            }
        if (!(blue >= 0 && blue <= 255)){
             System.out.println("Sorry you must enter values between 0-255");
             System.exit(1);
            }
       
        String hex = Integer.toHexString(red);
        String hex2 = Integer.toHexString(green);
        String hex3 = Integer.toHexString(blue);
        System.out.printf("The decimal numbers R:%3d, G:%3d, B:%3d, is represented in hexadecimal as: %s%s%s \n", red, green, blue, hex, hex2, hex3);
    
    }
    
    
}