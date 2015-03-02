// Rami Nasrallah   
// 3/2/2015
// Run Factorial java program
// Program to calculate a factorial

import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter an integer that is between 9 and 16");
        while (!scan.hasNextInt()){ 
                System.out.println("invalid input, Enter again");
                scan.next();
            }    
        
            int x=scan.nextInt();
            
        while (x<9||x>16){
                System.out.println("invalid input, Enter again");
                x=scan.nextInt();
            }
        int result = 1;
        while (x>9&&x<16){
                System.out.println("Input accepted:");
                for (int i = 1; i <= x; i++) {
                result = result * i;
                }
                System.out.println(+x+ "!=" +result);
                scan.next();
            }
    }
}