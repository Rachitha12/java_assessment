package at_par_java_assessement;

import java.util.Scanner;

public class primenumbers_ques2 
{
		public static void main(String[] args)
		{
			int i,j,k,n;
			System.out.println("enter the value of n: ");
		    Scanner sc=new Scanner(System.in);
		    n=sc.nextInt();
			System.out.println("prime numbers are");
			for(i=2;i<=n;i++)
			{
		       k=0;
		       for(j=2;j<i;j++) 
		           {
			          if(i%j==0)
			            {
				           k++;
				break;
			}
		    }
		    if(k==0)
			System.out.println(i);
			}
		}
	}
