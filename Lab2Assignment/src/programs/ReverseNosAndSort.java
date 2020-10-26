
/**Author:Dharani
 * Date:23/10/2020
 * Desc:Reverse numbers ,sorting it & return resultant array
 * program no 3
 */

package programs;
import java.util.*;

public class ReverseNosAndSort {
	
	
		public static int[] getSorted(int[] arr) {  //creating method for reverse
			for(int i=0;i<arr.length;i++) {
				int reverse=0;
				while(arr[i]>0) {          // Reversing the numbers in the array
					int temp=arr[i]%10;
					reverse=reverse*10+temp;
					arr[i]=arr[i]/10;
				}
				arr[i]=reverse;
			}
			Arrays.sort(arr);          // Sorting the array after reversing the numbers
			return arr;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the number of elements in the array");
	        int size=scan.nextInt();
	        int array[]=new int[size];  //Declaration and initialization of integer array
	        System.out.println("Enter the elements in the array");
	        for(int i=0;i<size;i++) {
	       	 array[i]=scan.nextInt();
	        }
	        int sortedArray[]=getSorted(array);
	        System.out.println("The sorted array is");
	        for(int i=0;i<size;i++) {
	        	System.out.println(sortedArray[i]);    // Printing the sorted array
	        }
	        scan.close();
		}

	}


