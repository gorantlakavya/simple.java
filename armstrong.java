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
                           int rem=0;  
 		   int sum=0;
 		   int temp=a;
 		   while(a>0)
		   {
		   	  a=a/10;
		   	  rem = rem % 10;
		   	  sum=sum*rem*rem*rem;
		   	  sum=sum+(rem*rem*rem);
		   }
		   if(temp==sum)
		     {
		     		System.out.println("yes");
 		     }
 		    else
 		    {
 		    	System.out.println("no");
		    }
}
}
