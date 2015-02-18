//  Rami Nasrallah
//  17/2/2015
//  Banking java program
//  Finding the final balance after someone withdraws, deposits or just wants to view and account

import java.util.Scanner;

public class Banking{
    // main method required for every Java program
   	public static void main(String[] args) {
   	int num;
   	int balance;
   	int number;
   	String response;
   	String deposit;
   	String withdraw;
   	String balance;
   	Scanner myScanner;
    myScanner = new Scanner( System.in );
   	 
   	Random r = new Random();
    int Low = 1000;
    int High = 5000;
    int number = r.nextInt(High-Low) + Low;
   	System.out.println("Would you like to view your balance, withdraw or deposit in your balance?");
   	System.out.println("Answer with 'view', 'withdraw' or 'balance': ");
   	
   	response = myScanner.next();
   	
   	switch (response):
   	  {
         case 'view' :
            System.out.println("Balance = $" +number); 
            break;
         case 'withdraw' :
             System.out.prinln("Enter how much you would like to withdraw: ");
             num = myScanner.next();
             if (num>0){
                 balance = number-num;
                 System.out.println("The resultant balance = $" +balance);
                 else num<0||number-num<0
                 System,out,println("The number you entered is invalid.(Either not a positive number or not enough money in account");
             }
             break;
         case 'deposit' :
            System.out.println("Enter how much you would like to deposit: ");
            num = myScanner.next();
                if (num<0){
                    System.out.println("Number must be positive");
                    else num>0
                    balance = number+num;
                    System.out.println("The resultant balance = $" +balance);
                }
            break;
         
         default :
            System.out.println("Invalid Answer");
      }
   	
   	
   	}
    
}