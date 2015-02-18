//  Rami Nasrallah
//  16/2/2015
//  Which Number java program
//  Finding a number between one and ten through different questions

import java.util.Scanner;

public class WhichNumber{
    // main method required for every Java program
   	public static void main(String[] args) {
   	Scanner myScanner;
   	String response;
    myScanner = new Scanner( System.in );
        System.out.println("Think of a number between 1 and 10");
        System.out.println("Answer the following question with a y or n for yes and no");
   	    System.out.println("Is it an even number?");
   	    response=myScanner.next();
   	    if(response.equals("y")||response.equals("Y")) {
   	        //everything on even side
   	         System.out.println("Is it divisible by 3?");
   	         response=myScanner.next();
   	         if(response.equals("y")||response.equals("Y")){
   	         System.out.println("Is your number 6?");
   	         }
   	         else if(response.equals("n")||response.equals("N")){
   	            System.out.println("Is your number divisible by 4?");
   	            response=myScanner.next();
   	            if(response.equals("y")||response.equals("Y")){
   	                System.out.println("Is your number greater than 1?");
   	                response=myScanner.next();
   	                if(response.equals("y")||response.equals("Y")){
   	                    System.out.println("Is your number 8?");
   	                }
   	                else if(response.equals("n")||response.equals("N")){
   	                    System.out.println("Is your number 1?");
   	                }
   	            }
   	            else if(response.equals("n")||response.equals("N")){
   	                System.out.println("Is your number divisible by 5?");
   	                response=myScanner.next();
   	                if(response.equals("y")||response.equals("Y")){
   	                    System.out.println("Is your number 10");
   	                }
   	                    else if(response.equals("n")||response.equals("N")){
   	                        System.out.println("Is your number 2");
   	                    }
   	            }
   	         }
   	    }
   	    else if(response.equals("n")||response.equals("N")) {
   	        //everything on odd side
   	        System.out.println("Is it divisible by 3?");
   	        response=myScanner.next();
   	         if(response.equals("y")||response.equals("Y")){
   	             System.out.println("When divided by 3 is the result greater than 1?");
   	             response=myScanner.next();
   	              if(response.equals("y")||response.equals("Y")){
   	                  System.out.println("Is your number 9");
   	              }
   	              else if(response.equals("n")||response.equals("N")){
   	                  System.out.println("Is your number 3");
   	              }
   	         }
   	        else if(response.equals("n")||response.equals("N")){
   	             System.out.println("Is it greater than 6?");
   	             response=myScanner.next();
   	             if(response.equals("y")||response.equals("Y")){
   	                 System.out.println("Is your number 7");
   	             }
   	             else if(response.equals("n")||response.equals("N")){
   	                  System.out.println("Is it less than 3?");
   	                  response=myScanner.next();
   	                  if(response.equals("y")||response.equals("Y")){
   	                     System.out.println("Is your number 1"); 
   	                  }
   	                  else if(response.equals("n")||response.equals("N")){
   	                     System.out.println("Is your number 5");  
   	                  }
   	             }
   	        }
   	    }
   	}
}