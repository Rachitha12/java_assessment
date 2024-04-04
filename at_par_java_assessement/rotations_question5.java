package at_par_java_assessement;

import java.util.Scanner;

public class rotations_question5 
{
	public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array's length: ");
        int N = scanner.nextInt();
        System.out.print("rotation: ");
        int K = scanner.nextInt();
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
        {
        	System.out.print("enter the numbers: ");
            arr[i] = scanner.nextInt();
        }
        
        rotateArray(arr, K);
        
           for (int i = 0; i < N; i++) 
           {
            System.out.print(arr[i] + " ");
        }
    }
    
    private static void rotateArray(int[] arr, int K) {
        int length = arr.length;

        K = K % length;
        
        int[] temp = new int[K];
  
        for (int i = 0; i < K; i++)
        {
            temp[i] = arr[length - K + i];
        }
        
        for (int i = length - 1; i >= K; i--) 
        {
            arr[i] = arr[i - K];
        }
        
        for (int i = 0; i < K; i++)
        {
            arr[i] = temp[i];
        }
    }
}
