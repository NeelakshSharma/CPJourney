/* package whatever; // don't place package name! */

import java.util.Scanner;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(helper(arr, n));
	}
	
	public static int helper(int[] arr, int n){
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i : arr){
			min = Math.min(i, min);
		}
		for(int i : arr){
			max = Math.max(i, max);
		}
		int minTotal = Integer.MAX_VALUE;
		for(int num = min; num<=max; num++){
			int total = 0;
			for(int i : arr){
				total += (num-i) * (num-i);
			}
			minTotal = Math.min(total, minTotal);
		}
		return minTotal;
	}
}
