//Rami Nasrallah
//20/3/2015
// Java program using different methods for a game

import java.util.Scanner;

public class HW8{
        public static void main(String[] args) {
            char option;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
            System.out.println("Hero! Have a good day!");
        }
            public static void giant() {
                System.out.println("                                 ---------                    ");
                System.out.println("                                |  /    \\|                   ");
                System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
                System.out.println("                           H     -----------   H              ");
                System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
                System.out.println("                           H    HHHHHHHHHHH    H                      ");
                System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
                System.out.println("                                HHHHHHHHHHH                   ");
                System.out.println("                                HHH     HHH                   ");
                System.out.println("                               HHH       HHH                   ");
            }
            public static void cave() {
                System.out.println("                              *****   * * * * * * * *        ");
                System.out.println("                         ***         ***                      ");
                System.out.println("                      ***               ***                   ");
                System.out.println("                 |    ***               ***                   ");
                System.out.println("                 |    ***               ***                   ");
                System.out.println("             O __|__  ***               ***                   ");
                System.out.println("           ******l    ***               ***                   ");
                System.out.println("            * *       ***               ***                   ");
                System.out.println("           *   *      ********************* * * * * * *       ");
            }
            public static void box(){
                System.out.println("                     *********************     *********************    *********************             ");
                System.out.println("                     ***               ***     ***               ***    ***               ***              ");
                System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
                System.out.println("                     ***               ***     ***               ***    ***               ***              ");
                System.out.println("                     *********************     *********************    *********************               "); 
            }
            public static String getInput(Scanner key, String key1){
                String input = key.next();
                if (input.equals("c")||input.equals("C")){
                    return input;
                }
                else{
                    System.out.println("Yea right LOSER!");
                    System.exit(1);
                }
                return input; 
            }
            public static String getInput(Scanner key, String key1, int trial){
                String input = key.next();
                while (trial>0) {
                    if (input.equals("A")||input.equals("a")){
                        int randomNum = 0 + (int)(Math.random()*2);
                        if (randomNum==1){
                            System.out.println("Critical Hit!");
                            trial--;
                            input=key.next();
                        }
                        else {
                            System.out.println("Gosh! How can you miss it!");
                            randomNum = 0 + (int)(Math.random()*1);
                            input=key.next();
                        }
                    }
                    else if (input.equals("E")||input.equals("e")){
                    int randomNum = 1 + (int)(Math.random()*11);
                        if (randomNum==10){
                            System.out.println("Escaped Successfully!");    
                            System.exit(1);
                        }
                        else {
                            System.out.println("You failed to escape");
                            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
                            input = key.next();
                        }
                    }
                    else{
                        System.out.println("Executed by the GIANT! Game Over!");
                        System.exit(1);
                    }
                }
                return input;
            }
            public static String getInput(Scanner key2){
                String scan = key2.next();
                switch (scan){
                    case "1" :
                        System.out.println("You found a million dollars!");
                        break;
                    case "2" :
                        System.out.println("The treasure box is filled with jewels!");
                        break;
                    case "3" :    
                        System.out.println("You found a dragon in the treasure box!");
                } 
                return scan;
            }
}