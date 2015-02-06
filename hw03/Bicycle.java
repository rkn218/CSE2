//  Rami Nasrallah
//  2/6/2015
//  Bicycle java program
//  Program that measures the distance, speed and time of a bicycle trip

import java.util.Scanner;

//  Define a class
public class Bicycle{
    
    //Main Method required for every java program
    public static void main(String[] args) {
    
        Scanner myScanner;
        myScanner = new Scanner( System.in );
    
        System.out.print("Enter the number counts on the cyclometer: ");
        int nCounts = myScanner.nextInt();
        System.out.print("Enter the seconds the counts took: ");
        int Seconds = myScanner.nextInt();
        
        // Useful Constants
	    double wheelDiameter=27.0,  //
  	    PI=3.14159, //
  	    feetPerMile=5280,  //
  	    inchesPerFoot=12,   //
  	    secondsPerMinute=60;    //
        
        double distance=wheelDiameter*nCounts*PI/inchesPerFoot/feetPerMile; //was given in inches and converted to miles
        double time=Seconds/secondsPerMinute; //converted into mins from seconds
        double speed=distance/(time/60);
        
        System.out.println("The distance was: " + distance + " miles and took: " + time + " minutes.");
        System.out.println("The average mph was " + speed );
        
        
    }
    
}