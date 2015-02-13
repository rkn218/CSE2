//  Rami Nasrallah
//  13/2/2015
//  Cookies java program
//  Finding whether the cookies you bought will divide evenly among your friends

import java.util.Scanner;

public class Cookies{
    // main method required for every Java program
   	public static void main(String[] args) {
    
    int num_people = 0;
    int num_cookies = 0;
    int num_cookies_people = 0;
        Scanner myScanner;
        myScanner = new Scanner( System.in );
       
        System.out.print("Enter the number of People: ");
        if(myScanner.hasNextInt()){
        
              num_people = myScanner.nextInt();
        
                System.out.print("Enter the number of cookies you are planning to buy: ");
        
                    if(myScanner.hasNextInt()){
                
                      //System.out.print("Enter the number of cookies you are planning to buy: ");
                         num_cookies = myScanner.nextInt();
                         System.out.print("How many do you want each person to get? ");
                    
                              if(myScanner.hasNextInt()){
                               num_cookies_people = myScanner.nextInt();
                                  
                              }
                                   else{
                                    System.out.println("You did not enter an int");
                                     return;    //leaves the program, i.e.
                                        //the program terminates
                                         }
                
                }
                      else{
                    System.out.println("You did not enter an int");
                    return;    //leaves the program, i.e.
                    //the program terminates
                    }
                }
                
                 else{
            System.out.println("You did not enter an int");
            return;    //leaves the program, i.e.
                //the program terminates
            }
            
            
            if(num_people*num_cookies_people<=num_cookies){
                System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            }
            
        else{
            System.out.println("You will not have enough cookies. You need to buy at least " +((num_cookies_people*num_people)-num_cookies)+  " more.");
            
        }

   	}  //end of main method   
  	
} //end of class