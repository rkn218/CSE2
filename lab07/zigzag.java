// Rami Nasrallah   
// 3/6/2015
// Zig Zag java program
// Use while loops to run different tasks

import java.util.Scanner;

public class zigzag{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String answer = "y";
        do{
        System.out.println("Enter an int between 3 and 33");
        while (!scan.hasNextInt()){
            System.out.println("Invalid Input must be an integer");
            scan.next(); 
        }
        
        int nStars = scan.nextInt();
        int h = 1;
        int x = 0;
        while (nStars>33 || nStars<3){
            System.out.println("The number is out of range [3:33]");
            while (!scan.hasNextInt()){
            System.out.println("Invalid Input must be an integer");
            scan.next(); 
        }
            nStars = scan.nextInt();
        }
        
        int nStars1 = nStars;
        while(nStars1>0){
            System.out.print("*");
            nStars1--;
        }
        System.out.println();
        int nStars2 = nStars;
        while (nStars2-2>0){
            while (x<h){
                System.out.print(" ");
                x++;
            }
            System.out.println("*");
            nStars2--;
            h++;
            x=0;
        }
        int nStars3 = nStars;
        while(nStars3>0){
            System.out.print("*");
            nStars3--;
        }
        System.out.println();
        System.out.println("Enter y or Y to go again: ");
        answer = scan.next();
        }while (answer.equals("y")||answer.equals("Y")); 
}
}