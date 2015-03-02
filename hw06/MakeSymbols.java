// Rami Nasrallah   
// 3/2/2015
// Make Symbols java program
// Program to print symbols according on wether they are even or odd

public class MakeSymbols{
    public static void main(String[] args){
        
        int i = (int) (Math.random()*100);
        System.out.println("Random number generated: " +i);
    
        while ((i%2)==0){
            System.out.print("The output pattern: ");
            int x=1;
            while (x<=i){
                System.out.print("*");
                x++;
            }
            break;
        }
        while ((i%2)==1){
            System.out.print("The output pattern: ");
            int x=1;
            while (x<=i){
                System.out.print("&");
                x++;
            }
            break;
        }
        System.out.println();
        
    }
}