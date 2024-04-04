package at_par_java_assessement;

import java.util.Scanner;

public class If_else_question1 
{
		    public static void main(String[] args) 
		    {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("enter the number: ");
		        int num = scanner.nextInt();
		        if (num % 2 != 0)
		        {
		            System.out.println("Weird");
		        } 
		        else 
		        {    	           
		        	if (num >= 2 && num <= 5)
		        	{
		                System.out.println("Not Weird");
		            } 
		        	else if (num >= 6 && num <= 20)
		            {
		                System.out.println("Weird");
		            }
		        	else
		            {
		                System.out.println("Not Weird");
		            }
		        }
		    }
}
