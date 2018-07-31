/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 int b=sc.nextInt();
                         String  primeNumbers = "";
                         for (int i = a+1; i <= b-1; i++)         
                                { 		  	  
                                   int counter=0; 	  
                                    for(int num =i; num>=1; num--)
	                             {
                                           if(i%num==0)
	                                 {
 	                         	counter = counter + 1;
	                                  }
	                               }
	                                 if (counter ==2)
	                                   {
	                                     //Appended the Prime number to the String
	                                       primeNumbers = primeNumbers + i + " ";
	                                    }	
                                 }	
                                  System.out.println(primeNumbers);
	}
}
