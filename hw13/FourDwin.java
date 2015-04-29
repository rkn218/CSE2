// Rami Nasrallah
// 28/4/2015
// java program for manipulating multidimensional arrays

import java.util.Scanner;
import java.util.Random;

public class FourDwin{
    public static void main(String[] args){
        
        Random rand=new Random();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number for X: ");
        while(!scan.hasNextInt()){
                System.out.println("Input must be an integer, Enter again");
                scan.next();
            }
        int x = scan.nextInt();
        while(x<0){
                System.out.println("Integer must be positive, Enter again");
                    while(!scan.hasNextInt()){
                    scan.next();
                    System.out.println("Input must be an integer, Enter again");
                    }
            x = scan.nextInt();
            }
        System.out.print("Enter a number for Y(must be greater than x): ");
        while(!scan.hasNextInt()){
                System.out.println("Input must be an integer, Enter again");
                scan.next();
            }
        int y = scan.nextInt();
        while(y<0||y<x){
                System.out.println("Integer must be positive and greater than x, Enter again");
                    while(!scan.hasNextInt()){
                    scan.next();
                    System.out.println("Input must be an integer, Enter again");
                    }
            y = scan.nextInt();
            }
        
        int d1 = (int)(Math.random()*(y-x+1))+x;
        int d2 = (int)(Math.random()*(y-x+1))+x;
        int d3 = (int)(Math.random()*(y-x+1))+x;
        
        double[][][][] array = new double[3][d1][d2][d3];
        
        for(int i = 0; i<3; i++){
            for(int j = 0; j<d1; j++){
                for(int k = 0; k<d2; k++){
                    for(int l = 0; l<d3; l++){
                        array[i][j][k][l] = ((int)((Math.random()*30)*10))/10;
                    }
                }
            }
        }
        System.out.println("Orginal Array: ");
        printArray(array);
        double[][][][]array2 = sort4darray(array);
        System.out.println();
        System.out.println("Sorted Array: ");
        printArray(array2);
        statArray(array);
    }
    public static void printArray(double[][][][] array){
        System.out.print("{");
        for(int i = 0; i<3; i++){
            System.out.print("{");
            for(int d1 = 0; d1<array[i].length; d1++){
                System.out.print("{");
                for(int d2 = 0; d2<array[i][d1].length; d2++){
                    System.out.print("{");
                    for(int d3 = 0; d3<array[i][d1][d2].length; d3++){
                        System.out.print(array[i][d1][d2][d3]+", ");
                    }
                    System.out.println("}");
                }
                System.out.println("}");
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
    public static void statArray(double [][][][] array){
        int elements = 0;
        double sum = 0;
        for(int i = 0; i<3; i++){
            for(int d1 = 0; d1<array[i].length; d1++){
                for(int d2 = 0; d2<array[i][d1].length; d2++){
                    for(int d3 = 0; d3<array[i][d1][d2].length; d3++){
                        elements++;
                        sum = sum+array[i][d1][d2][d3];
                    }
                }
            }
        }
        double mean = (int)((sum/elements)*10)/10;
        System.out.println("Sum of elements in array = "+sum );
        System.out.println("Mean = " + mean);
        System.out.println("Number of elements = " +elements); 
    }
    public static double[][][][] sort4darray(double[][][][] array){
        for(int i = 1; i<3; i++){
            double[][][] temp = array[i];
            for (int j = i-1; j>=0 && temp.length<array[j].length; j--){
                array[j+1] = array[i];
                array[j+1] = temp;
            }
        } 
        return array;
    }
}