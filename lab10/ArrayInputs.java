// Rami Nasrallah
// 4/3/2015
// Java program to collect, save and print and array

import java.util.Scanner;

public class ArrayInputs{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer for the size of an array: ");
        int size = -2;
        int num = -2;
        while(!scan.hasNextInt()){
                System.out.println("invalid input, Enter again");
                scan.next();
            }
            size=scan.nextInt();
        while(size<=0){
            System.out.println("invalid input, Enter again");
                while(!scan.hasNextInt()){
                scan.next();
                System.out.println("invalid input, Enter again");
            }
            size=scan.nextInt();
        }
        
        int [] array = new int [size];
        for (int i=0; i<size; i++){
            System.out.println("Please enter a positive integer: ");
            num = -3;
            while(!scan.hasNextInt()){
                System.out.println("invalid input, Enter again");
                scan.next();
            }
            num=scan.nextInt();
            while(num<=0){
            System.out.println("invalid input, Enter again");
                while(!scan.hasNextInt()){
                scan.next();
                System.out.println("invalid input, Enter again");
            }
            num=scan.nextInt();
            }   
            array[i] = num;
        }
        System.out.println("The array is:");
         for (int p=0; p<size; p++){
            System.out.println(array[p]);
         }
        
    }
}