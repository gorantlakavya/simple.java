   int th1,th2,tm1,tm2,q;
	   Scanner s=new Scanner(System.in);
	   th1=s.nextInt();
	   tm1=s.nextInt();
	   th2=s.nextInt();
	   tm2=s.nextInt();
	   int n=th1*60+tm1;
	   int m=th2*60+tm2;
	   if(n>m)
	   {
	   	 q=n-m;
	   }
	   else 
	    { q=m-n;}
	    
	    System.out.println(q/60+" "+q%60);
	 }
}
