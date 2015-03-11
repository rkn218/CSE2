// Rami Nasrallah   
// 3/8/2015
// Waves java program
// Use For While, While and Do While loops to run different tasks

import java.util.Scanner;

public class waves{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a number between 1 and 30: ");
    
    while (!scan.hasNextInt()){
            System.out.println("Invalid Input must be an integer");
            scan.next(); 
        }
        
        int num = scan.nextInt();
        
        while (num>30 || num<1){
            System.out.println("The number is out of range [1:30]");
            while (!scan.hasNextInt()){
            System.out.println("Invalid Input must be an integer");
            scan.next(); 
            }
            num = scan.nextInt();
        }
        
        System.out.println("FOR LOOP:");
        for (int x=0; x<=num; x++) {
            if (x%2==0){
                for (int b=1; b<=x; b++){
                    for (int y=1; y<=b; y++){
                    System.out.print(x);  
                    }
                System.out.println();    
                }
            }
            else {
                for (int b=x; b>=1; b--){
                    for (int y=1; y<=b; y++){
                    System.out.print(x);  
                    }
                System.out.println();    
                }
            }
        }
        System.out.println();
        System.out.println("WHILE LOOP:");
        int x=0, y=1;
        while (x<=num) {
            if (x%2==0){
                int b=1;
                while (b<=x){
                    y=1;
                    while (y<=b){
                    System.out.print(x);  
                    y++;
                    }
                System.out.println();    
                b++;
                }
            }
            else {
                int b=x;
                while (b>=1){
                    y=1;
                    while (y<=b){
                    System.out.print(x);  
                    y++;
                    }
                System.out.println();    
                b--;
                }
            }
        x++;
        }
        System.out.println();
        System.out.println("DO-WHILE LOOP:");
        x=1; y=2;
        do {
            if (x%2==0){
                int b=1;
                do {
                    y=1;
                    do {
                    System.out.print(x);  
                    y++;
                    } while (y<=b);
                System.out.println();    
                b++;
                } while (b<=x);
            }
            else {
                int b=x;
                do {
                    y=0;
                    do {
                    System.out.print(x);  
                    y++;
                    }while (y<b);
                System.out.println();    
                b--;
                }while (b>=1);
            }
        x++;
        }while (x<=num);
        
    }
}