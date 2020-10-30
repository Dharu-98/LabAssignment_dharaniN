/**
Author: Dharani
Date  : 26/10/2020
Desc  : To display sum of integers using string tokenizer
*/

package programs;
import java.util.*; 
public class SumOfIntegers{

	public static void main(String[] args) {
		int number,sum=0;
		StringTokenizer string=new StringTokenizer("1 4 6 2 7 3"); // using stringTokenizer
		while(string.hasMoreTokens())
		{
			number=Integer.parseInt(string.nextToken());
			sum=sum+number;
			System.out.println("The ingegers are :"+number);
		}
		System.out.println("Sum obtained ="+sum);

	}

}