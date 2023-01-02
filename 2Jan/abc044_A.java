/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long X = sc.nextLong();
		long Y = sc.nextLong();
		System.out.println(((N<=K ? N : K)*X) + (N<=K ? 0: ((N-K)*Y)));
	}
}
