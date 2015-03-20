// Rami Nasrallah
// 20/3/2015
// Factorials java program
// Java program using methods to calculate the sum of factorials

import java.util.Scanner;//Statement to start the import program

public class Factorials{//open a class
    public static void main(String[] args){//have the main method where the import takes place
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int sup = scan.nextInt();//collects entered number in variable sup
        int sum = 0; //states variable sum 
        //for loop to calculate the factorials for numbers in the range [1:sup]
        for(int i = 1; i <= sup; i++){
        sum += factorial(i);//adds all the of factorials together to get the sum
        }//end of for loop
        print(sup,sum);//link the mainmethod to the final print method
    }//end of main method
    public static int factorial(int input){//method to calculate the factorials for each number
        int mul = 1;//states the variable mul
        for (int i = 1; i <= input; i++){//for loop to calculate the factorial
        mul *= i;
        }//end of for loop
        return mul;//returns the mul variable to 1 to calculate the factorial properly
    }//end of factorial method
    public static void print(int num, int total){//a method to print out the final result
        System.out.println("The super factorial of "+num+" is " +total );
    }//end of print method
}//end of class