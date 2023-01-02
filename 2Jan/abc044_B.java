/* package whatever; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(helper(s) ? "Yes" : "No");
	}
	
	public static boolean helper(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()){
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for(Map.Entry<Character, Integer> e : map.entrySet()){
			if(e.getValue()%2!=0){
				return false;
			}
		}
		return true;
	}
}
