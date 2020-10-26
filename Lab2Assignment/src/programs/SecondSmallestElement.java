
/**
 * Date:23/10/2020
 * @author D H A R A N I
 * Desc: Testing compilation & running secondsmallest element
 * program no 1
 */

package programs;
public class SecondSmallestElement {
	
	public static int getSecondSmallest(int[] a, int count) {
		int temp;
		for(int i=0;i<count;i++) {
			
			for(int j=i+1;j<count;j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,7,5,8}; // 
		System.out.println("Second smallest:"+getSecondSmallest(a,4));
		

	}

}
