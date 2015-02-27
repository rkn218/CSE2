// Rami Nasrallah
// 27/2/2015
// Smile Generator java program
// Program to generate and print out a random number of smiley faces :)

 
public class SmileGenerator{
    public static void main(String[] args){
        
        int i = (int) (Math.random()*100);
        int x = 0;
        int y = 0;
        int linelimit=1;
        while (x<5){
            System.out.print(":)");
            x++;
        }
        System.out.println();
        while (x<i){
            System.out.print(":)");
            x++;
        }
        x=0;
        System.out.println();
        while (x<i){
   
            if (y==30){
                System.out.println();
                y=0;
            }
            System.out.print(":)");
            x++;
            y++;
        }
        System.out.println();
        x=0;
        y=0;
        while (x<i){
            System.out.print(":)");
            x++;
            y++;
            if (y==linelimit){
                System.out.println("");
                y=0;
                linelimit++;
            }
            
        }
        System.out.print("");
    
    }
}