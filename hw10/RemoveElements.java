// Rami Nasrallah
// 4/4/2015
// Java program to remove in different ways elements from an array

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.println("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(){
      int[] ar=new int[10];
      int random;
      for (int i=0; i<10; i++){
      random = (int)(Math.random()*9);
      ar[i]=random;
      }
      return ar;
  }
  public static  int[] delete(int[] num, int index){
      if (index>num.length){
          System.out.println("Index is not valid.");
          return num;
      }
      int[] array1 = new int[num.length-1];
      for (int i = 0; i<index; i++){
         array1[i] = num[i]; 
      }
      for (int i=index+1; i<num.length; i++){
         array1[i-1] = num[i]; 
      }
      return array1;
  }
  public static int[] remove(int []num, int target){
      boolean found=false;
      for (int i = 0; i<num.length; i++){
         if (num[i] == target){
             num=delete(num, i);
             found=true;
             i--;
         }
      }
      if(found) {
          return num;
      }
      else {
          System.out.printf("ELement %3i was not found", target);
          return num;
      }
  }
}