
/**Author:Dharani
 * Date:23/10/2020
 * Desc:Removing dulicate elements in an array & sorting in desc order
 * program no 4
 */

package programs;

import java.util.*;

//import java.util.Arrays;
//import java.util.Scanner;

public class RemoveDuplicates {
	
	private static int modifyArray(int[] arr,int count) {    //method to remove duplicates
		int j=0;
		int temp[]= new int[count];
		for(int i=0;i<count-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[count-1];
		
		for(int i=0;i<count;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
	Arrays.sort(arr);
	int length=modifyArray(arr,n);
	System.out.println("The new array is ");
	for(int i=length;i>0;i--) {
		System.out.println(arr[i]+" ");
	}
		
		
	}

}
