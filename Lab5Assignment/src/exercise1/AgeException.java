
/**
 * Desc:To validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 * author:Dharani
 *
 */

package exercise1;

import java.util.*;

public class AgeException {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		try {
			if(age<=15) {
				throw new InvalidAgeException("Invalid age");
		}
			else {
				System.out.println("Your age is: "+age);
		}
		}
		catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
		}
		s.close();

	}

}
