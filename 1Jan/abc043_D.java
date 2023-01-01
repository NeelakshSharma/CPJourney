//idea taken from https://blog.51cto.com/wydxry/3093556

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		helper(s, s.length());
	}

	public static void helper(String s, int n){
		for(int i = 0; i<n-1; i++){
			if(s.charAt(i)==s.charAt(i+1)){
				System.out.println((i+1)+" "+(i+2));
				return;
			}
		}
		
		for(int i = 0; i<n-2; i++){
			if(s.charAt(i)==s.charAt(i+2)){
				System.out.println((i+1)+" "+(i+3));
				return;
			}
		}
		System.out.println("-1 -1");
	}
}
