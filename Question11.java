package CoreJava;

import java.util.Scanner;

public class Question11 
{
 public static int MaxInArray(int[] Array)
 {
	 int max=Array[0];
	 for(int i=0; i<Array.length; i++)
		 if(Array[i]>max)
			 max = Array[i];
	 return max;
 }
 
 public static int MinInArray(int[] Array) 
 {
	 int min=Array[0];
	 for(int i=0; i<Array.length; i++)
		 if(Array[i]<min)
			 min = Array[i];
	 return min;
 }
 
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the no. of element in the array :");
	 int no = sc.nextInt();
	 int[] Array = new int[no];      // initializing the array
	 System.out.println("Enter the element of array :");
	 
	 for(int i=0; i<no; i++)        // entering the element of the array
	 {
		 System.out.println("Enter the "+ i + " element");
		 Array[i] = sc.nextInt();   
	 }
	 sc.close();
	 
	 int max = MaxInArray(Array);
	 System.out.println("The max element in the array is :" + max);
	 
	 int min = MinInArray(Array);
	 System.out.println("The min element in the arry is :" + min);
 }	 
}
