

/**
Author: Dharani
Date  : 26/10/2020
Desc  : replacing cosonants with its next alphabet
*/

package programs;
import java.util.*;

public class ReplaceConsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println("Before replacing :");
		System.out.println(str);
		System.out.println("After replacing :"+alterString(str));

	}

	private static String alterString(String str) {
		String temp="";
		for(int i=0;i<str.length();i++) 
		{
			char charAtIndex=str.charAt(i);
			int index=charAtIndex;
			if(!(charAtIndex=='a' ||charAtIndex=='A' ||charAtIndex=='e' ||charAtIndex=='E'|| charAtIndex=='i'||charAtIndex=='I'||charAtIndex=='o'||charAtIndex=='O'||charAtIndex=='u'||charAtIndex=='U'))
				
			{
				charAtIndex=(char) (index+1);
				temp=temp+charAtIndex;
			}
			else
			{
				temp=temp+charAtIndex;
			}
		}
		return temp;
	}

}