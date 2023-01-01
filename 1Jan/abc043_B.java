import java.util.Scanner;
import java.lang.StringBuffer;
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		StringBuffer sb1 = new StringBuffer("");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb2 = new StringBuffer(s);
		sb2 = sb2.reverse();
		int count = 0;
		for(int i = 0; i<sb2.length(); i++){
			char c = sb2.charAt(i);
			// System.out.println("for char: " + c + "count : " + count);
			if(c=='B'){
				count++;
			}
			else{
				if(count==0){
					sb1.append(c);
				}
				else{
					count--;
				}
			}
		}
		System.out.println(sb1.reverse().toString());
	}
}
