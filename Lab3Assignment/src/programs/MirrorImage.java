

/**
 * @author - Dharani 
 * Desc  - A method to create the mirror image of a String using StringBuffer. 
 */

package programs;
import java.util.Scanner;
public class MirrorImage {
    
	public static String getImage(String str) {
		StringBuffer strBuffer=new StringBuffer(str);  //StringBuffer is used to make the string mutable. 
        strBuffer.reverse();       // It reverses the string 
        return strBuffer.toString();
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scan.next();
		String modifiedString=getImage(str);
		System.out.println("The resultant string is "+str+"|"+modifiedString);
        scan.close();
	}

	

}