/* package whatever; // don't place package name! */
// link: https://codeforces.com/problemset/problem/1772/C
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			int k = sc.nextInt();
			int n = sc.nextInt();
			helper(n, k);
			System.out.println("");
		}
	}
	
	public static void helper(int n, int k){
		int last = 1, diff = 1;
		while(k>0 && n - last >= k-1){
			System.out.print(last+" ");
			last += diff;
			diff++;
			k--;
			// System.out.println("n-last: " + (n-last)+" and k: " + k);
		}
		last -= (diff-1);
		while(k>0){
			k--;
			last++;
			System.out.print(last+" ");
		}
	}
}
