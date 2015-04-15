// Rami Nasrallah
// 2/4/2015
// Java progra to scarmble and find different integers in arrays

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[15];
        System.out.println("Enter 15 integers for final grades of CSE02: ");
        while(!scan.hasNextInt()){
                System.out.println("Input must be an integer, Enter again");
                scan.next();
            }
            array[0]=scan.nextInt();
            while(array[0]<0||array[0]>100){
                System.out.println("Integer is out of range [0:100], Enter again");
                    while(!scan.hasNextInt()){
                    scan.next();
                    System.out.println("Input must be an integer, Enter again");
                    }
            array[0] = scan.nextInt();
            }
        for (int i=1; i<15; i++){
            array[i] = scan.nextInt();
            while (array[i]<array[i-1]){
                System.out.println("Score must be greater to or equal to the last score, Enter again");
                    while(!scan.hasNextInt()){
                        System.out.println("Input must be an integer, Enter again");
                        scan.next();
                    }
                    array[i]=scan.nextInt();
                    while(array[i]<0||array[i]>100){
                        System.out.println("Integer is out of range [0:100], Enter again");
                        while(!scan.hasNextInt()){
                        scan.next();
                        System.out.println("Input must be an integer, Enter again");
                        }
                    array[i] = scan.nextInt();
                    }//while loop checks range and integer
            }//while loop to check that the next score is greater
        }//end of for loop
        System.out.print("The grades sorted are: ");
        for (int i=0; i<15; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.print("Enter a grade to search for: ");
        int num = scan.nextInt();
        System.out.println(binarySearch(num, array));
        scramble(array);
        System.out.print("Scrambled: ");
        for(int i=0; i<15; i++) {
        System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.print("Enter a grade to search for: ");
        num=scan.nextInt();
        System.out.println(linearSearch(num, array));
    }
    public static String binarySearch(int target, int[] array) {
        int high=array.length-1;
        int low=0;
        int mid=(low+high)/2;
        int iterations=0;
        while(low<=high&&array[mid]!=target) {
            iterations++;
            if(array[mid]<target) {
                low=mid+1;
            }
            else if(array[mid]>target) {
                high=mid-1;
            }
            mid=(high+low)/2;
        }
        if(low>high) {
            return target+" was not found in the list with "+iterations+" iterations";
        }
        return target+" was found in the list with "+iterations+" iterations";
    }
    public static void scramble(int[] array) {
        Random rand=new Random();
        int temp=0;
        int num;
        for(int i=0; i<15; i++) {
            num=rand.nextInt(15);
            temp=array[i];
            array[i]=array[num];
            array[num]=temp;
        }
    }
    public static String linearSearch(int target, int array[]) {
        int iterations=0;
        for(int i=0; i<15; i++) {
            iterations++;
            if(array[i]==target) {
                return target+" was found in the list with "+iterations+" iterations";
            }
        }
        return target+" was not found in the list with "+iterations+" iterations";
    }
}