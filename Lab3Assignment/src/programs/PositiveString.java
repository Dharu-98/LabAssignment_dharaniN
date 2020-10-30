/**
 * Desc: To check whether the given string is a positive string
 * @author D H A R A N I
 *
 */

package programs;

import java.util.*;

public class PositiveString {
	
	public static String checkPositive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)<str.charAt(i)) //checking the index value
			{
				System.out.println("Negative String");
			}
			else {
				System.out.println("Positive String");
			}
		}
		return str;
	}


public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String r=sc.nextLine();
	String str=checkPositive(r);
	sc.close();

	}

}
