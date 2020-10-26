
/**Author:Dharani
 * Date:23/10/2020
 * Desc: String objects are accepted & sorted in order
 * program no 2
 */


package programs;

import java.util.*;

public class UpperLowerStringsort {

       public static String[] sortStrings(String[] str) {       //method to accept an array of string & sort
		int len=str.length;
	    Arrays.sort(str);
	    if(len%2==0) {
	        for(int i=0,j=len/2;i<len/2;i++,j++) {
	    	    str[i]=str[i].toUpperCase();
	    	    str[j]=str[j].toLowerCase();
	        }
	    }
	    else {
	    	for(int i=0;i<len/2+1;i++) {
	    		str[i]=str[i].toUpperCase();
	    	}
	    	for(int j=len/2+1;j<len;j++) {
	    		str[j]=str[j].toLowerCase();
	    	}
	    }
	    return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of strings");
        int size =scan.nextInt();
        String stringArr[]=new String[size];
        System.out.println("Enter the string");
        for(int itr=0;itr<size;itr++) {
        	stringArr[itr]=scan.next().toLowerCase();
        }
        String[] sortedArray=sortStrings(stringArr);
        System.out.println("The sorted string array is");
        for(int itr=0;itr<size;itr++) {
        	System.out.println(sortedArray[itr]);
        }
        scan.close();
	}

}