//  Rami Nasrallah
//  2/6/2015
//  Root java program
//  Estimating the cube root

import java.util.Scanner;

//  Define a class
public class Root{
    
    //Main Method required for every java program
    public static void main(String[] args) {
        
       Scanner myScanner;
        myScanner = new Scanner( System.in );
    
        System.out.print("Enter a number ");
        double number = myScanner.nextDouble();
        
        double guess = number/3;
        double estimate1 = (2*guess*guess*guess+number)/(3*guess*guess); 
        double estimate2 = (2*estimate1*estimate1*estimate1+number)/(3*estimate1*estimate1); 
        double estimate3 = (2*estimate2*estimate2*estimate2+number)/(3*estimate2*estimate2); 
        double estimate4 = (2*estimate3*estimate3*estimate3+number)/(3*estimate3*estimate3); 
        double estimate5 = (2*estimate4*estimate4*estimate4+number)/(3*estimate4*estimate4); 

        
        System.out.println("Cube Root:");
        System.out.println("Estimate = " +estimate5);
        System.out.println(estimate5+" * "+estimate5+" * "+estimate5+" = "+(estimate5*estimate5*estimate5));
        
    } // End of the method
    
} // End of Class
    