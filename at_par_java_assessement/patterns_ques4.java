package at_par_java_assessement;

import java.util.Scanner;

public class patterns_ques4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int size = scanner.nextInt();
        
        for (int i = size; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
  
        for (int i = 2; i <= size; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
