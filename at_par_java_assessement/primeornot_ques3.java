package at_par_java_assessement;

import java.util.Scanner;

public class primeornot_ques3 
{
	public static void main(String[] args)
	{
		System.out.println("enter the value of number: ");
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=num;i++)
	    {
	    	if(num%i==0) 
	    	{
      	    count ++;
	    }
	    	}
	    if(count==2)
	    {
	    	System.out.println("number is a prime");
	    }
	    else 
	    {
	    	System.out.println("number is not a prime");
	    }
}
}
