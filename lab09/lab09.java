// Rami Nasrallah
// 27/03/2015
// Using methods to randomly form a sentence

import java.util.Random;
import java.util.Scanner;

public class lab09{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String answer = "";
        do{System.out.println("The " +adjective()+" "+color()+" "+noun()+" "+pasttense()+ " the " +adjective()+" "+noun());
        System.out.println("Would you like another sentence answer with either y or Y: ");
        answer = scan.next();
        }while (answer.equals ("y") || answer.equals("Y"));
    }


public static String adjective(){
    Random randomGenerator = new Random();
    String x = "";
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0:
            x="fat";
            break;
        case 1:
            x="lazy";
            break;
        case 2:
            x="fast";
            break;
        case 3:
            x="small";
            break;
        case 4:
            x="big";
            break;
        case 5:
            x="sluggish";
            break; 
        case 6:
            x="burly";
            break;
        case 7:
            x="shady";
            break;
        case 8:
            x="curvy";
            break;
        case 9:
            x="burlesque";
            break;
    }return x;}
    public static String color(){
    Random randomGenerator = new Random();
    String p = "";
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0:
            p="blue";
            break;
        case 1:
            p="green";
            break;
        case 2:
            p="yellow";
            break;
        case 3:
            p="brown";
            break;
        case 4:
            p="orange";
            break;
        case 5:
            p="pink";
            break; 
        case 6:
            p="red";
            break;
        case 7:
            p="purple";
            break;
        case 8:
            p="white";
            break;
        case 9:
            p="grey";
            break;
    }return p;}
    public static String noun(){
    Random randomGenerator = new Random();
    String k = "";
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0:
            k="cat";
            break;
        case 1:
            k="dog";
            break;
        case 2:
            k="bird";
            break;
        case 3:
            k="pigeon";
            break;
        case 4:
            k="man";
            break;
        case 5:
            k="woman";
            break; 
        case 6:
            k="sheep";
            break;
        case 7:
            k="ogre";
            break;
        case 8:
            k="computer";
            break;
        case 9:
            k="player";
            break;
    }return k;}
    public static String pasttense(){
    Random randomGenerator = new Random();
    String h = "";
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0:
            h="walked";
            break;
        case 1:
            h="ran";
            break;
        case 2:
            h="passed";
            break;
        case 3:
            h="swam";
            break;
        case 4:
            h="talked to";
            break;
        case 5:
            h="killed";
            break; 
        case 6:
            h="discovered";
            break;
        case 7:
            h="searched for";
            break;
        case 8:
            h="beat";
            break;
        case 9:
            h="defeated";
            break;
    }return h;}
}