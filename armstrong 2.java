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
 		  for(int i=a+1;i<b;i++)
 		    {
 		    	 int digits=0;
 		    	 int result=0;
 		    	 int temp=i;
 		    	 
 		    	  while(temp!=0)
 		    	    {
 		    	    	 temp=temp/10;
 		    	    	 digits++;
 		    	    }
 		    	    temp=i;
 		    	    while(temp!=0)
 		    	       {
 		    	       	  int remainder=temp%10;
		    	       	  result+=Math.pow(remainder,digits);
		    	       	  temp=temp/10;
		    	        }
		    	        if(temp==i)
		    	          System.out.println(temp+" ");
		    	        if(result==i)
		    	          System.out.print(i+" ");
		    }
	}
}
