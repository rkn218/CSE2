//  Rami Nasrallah
//  2/6/2015
//  Root java program
//  Estimating the cube root

//import java.util.Scanner;

//  Define a class
public class FourDigits{
    
    //Main Method required for every java program
    public static void main(String[] args) {
        
       Scanner myScanner;
        myScanner = new Scanner( System.in );
    
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double number = myScanner.nextDouble();
    
        int number1 = (int)(number*10000);
    
       
       int d1, d2, d3, d4;
       
       d4=number1%10;
       d3=(number1%100 - d4)/10;
       d2=(number1%1000 - (d3*10) -d4)/100;
       d1=(number1%10000 - (d2*100) - (d3*10) -d4)/1000;
       
       
       System.out.println("The Four digits are "+d1+" "+d2+" "+d3+" "+d4);
        

        
    }
    
}

