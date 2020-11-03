
/**
 * Desc:To validate the full name of an employee & to Create and throw a user defined exception if firstName and lastName is blank
 * @author Dharani
 *
 */

package empName;

import java.util.Scanner;
public class NameException {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first Name:");
		String firstName=s.nextLine();
		System.out.println("Enter the last Name:");
		String lastName=s.nextLine();
		try {
			if(firstName.length()==0||lastName.length()==0)
				throw new InvalidNameException("provide valid Input");
			else
				System.out.println("Your name is "+firstName+" "+lastName);
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
        s.close();
	}

}