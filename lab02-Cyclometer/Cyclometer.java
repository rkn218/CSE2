// Rami Nasrallah
// 30 January 2015
// Cyclometer java program
//
// first compile the program 
//      javac Cyclometer.java
//  run the program
//      java Cyclometer

// Define a class
public class Cyclometer{
    
// add a main method
public static void main(String[] args) {

    // The input data
        int secsTrip1=480;  //
       	int secsTrip2=3220;  //
		int countsTrip1=1561;  //
		int countsTrip2=9037; //
		
	// Useful Constants
	    double wheelDiameter=27.0,  //
  	    PI=3.14159, //
  	    feetPerMile=5280,  //
  	    inchesPerFoot=12,   //
  	    secondsPerMinute=60;  //
	    double distanceTrip1, distanceTrip2,totalDistance;  //
	    
	    //Print out the input numbers
	        System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
       	      
        //run the calculations
	        distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	        totalDistance=distanceTrip1+distanceTrip2;	
	        
	        //Print out the output data.
                System.out.println("Trip 1 was "+distanceTrip1+" miles");
	            System.out.println("Trip 2 was "+distanceTrip2+" miles");
	            System.out.println("The total distance was "+totalDistance+" miles");
       	      
	}  //end of main method
}   //end of class