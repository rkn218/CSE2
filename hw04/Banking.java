//  Rami Nasrallah
//  17/2/2015
//  Banking java program
//  Finding the final balance after someone withdraws, deposits or just wants to view and account

import java.util.Scanner;

public class Banking{
    // main method required for every Java program
   	public static void main(String[] args) {
   	int num;
   	String response;
   	int deposit;
   	int withdraw;
   	int balance;
   	Scanner myScanner;
    myScanner = new Scanner( System.in );
   	 
    int Low = 1000;
    int High = 5000;
    int number = (int)(Math.random()*(High-Low) + Low);
   	System.out.println("Would you like to view your balance, withdraw or deposit in your balance?");
   	System.out.println("Answer with 'view', 'withdraw' or 'deposit': ");
   	
   	response = myScanner.next();
   	
   	switch (response)
   	  {
         case "view" :
            System.out.println("Balance = $" +number); 
            break;
         case "withdraw" :
             System.out.println("Enter how much you would like to withdraw: ");
             num = myScanner.nextInt();
             if (num>0){
                 balance = number-num;
                 System.out.println("The resultant balance = $" +balance);
             }
                 else if(num<0||number-num<0)
                 System.out.println("The number you entered is invalid.(Either not a positive number or not enough money in account");
             break;
         case "deposit" :
            System.out.println("Enter how much you would like to deposit: ");
            num = myScanner.nextInt();
                if (num<0){
                    System.out.println("Number must be positive");
                }
                    else if(num>0) {
                    balance = number+num;
                    System.out.println("The resultant balance = $" +balance);
                    }
            break;
         
         default :
            System.out.println("Invalid Answer");
      }
   	
   	}
    
}