//Rami Nasrallah
//31 January 2015
//Arithmetic java program
//
//// first compile the program 
//      javac Arithmetic.java
//  run the program
//      java Arithmetic

//Define a class
public class Arithmetic{
    
//add a main method
public static void main(String[] args) {
    
    //Input data
    
     //Number of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    //(‘$’ is part of the variable name)
    double sockCost$=2.58;

    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glass
    double glassCost$=2.29;

    //Number of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
    
        //Using inputs calculate objectives
        double totalSockCost$=nSocks*sockCost$;
        double Socksalestax$=totalSockCost$*taxPercent;
        double totalGlassesCost$=nGlasses*glassCost$;
        double Glassessalestax$=totalGlassesCost$*taxPercent;
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
        double Envelopesalestax$=totalEnvelopeCost$*taxPercent;
        
        double TotalCost_withouttax=(totalEnvelopeCost$+totalGlassesCost$+totalSockCost$)*100;
        double TotalCost=(totalSockCost$+totalGlassesCost$+totalEnvelopeCost$+Socksalestax$+Glassessalestax$+Envelopesalestax$)*100;
        

        double TotalCost_without_tax= ((int) TotalCost_withouttax)/100;
        double Total_Cost= ((int) TotalCost)/100;
        
        
        //Print Calculations
            System.out.println("Total Cost for Socks " + totalSockCost$ + " Sales tax " + Socksalestax$);
            System.out.println("Total Cost for Glasses " + totalGlassesCost$ + " Sales tax "+Glassessalestax$);
            System.out.println("Total Cost for Envelope " + totalEnvelopeCost$ + " Sales tax " + Envelopesalestax$);
            
            System.out.println("Total cost of purchases before tax "  + TotalCost_without_tax);
            System.out.println("Total actually paid for this transaction "  + Total_Cost);
        
    
    }
}