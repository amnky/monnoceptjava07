import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class amount
{
   
    
	public static void main (String[] args) throws IOException
	{
	  Scanner sc= new Scanner(System.in);
	  int amount=sc.nextInt();
	  if(amount>50000){
	      System.out.println("please enter amount less than 50000");
	  }
	  else if(amount%100!=0){
	      System.out.println("Please enter amount multiple of 100");
	  }
	  else{
	      System.out.println("successfully executed amount with less than 50000 and multiple of 100");
	  }
	}
}
