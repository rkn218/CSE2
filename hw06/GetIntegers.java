// Rami Nasrallah
// 27/2/2015
// Get Integers java program
// Program to collect five non-negative integers and calculate the sum

import java.util.Scanner;
public class GetIntegers{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 5 non-negative integers");
        int x=0;
        int total=0;
        for (int i=1; i<6; i++){ 
            if (!scan.hasNextInt()){
                System.out.println("invalid input, Enter again");
                scan.next();
                i-- ; continue;
            }    
            
            x=scan.nextInt();
            if ((x>0)||(x==0)){
               total=x+total;
            }
            else {System.out.println("invalid input, Enter again"); 
            i--;
            }
        }
        System.out.println("Sum is " +total);
    }
}