package Edubridgepractice;
import java.util.Scanner;

public class CountTheNumberOfDigits {

	public void findTheDigitCount(int[] arr, int size)
	{
		int count=0,count1=0,count2=0;
	    for(int i =0; i<size;i++)
		{
			if(arr[i]>=1 && arr[i]<=9)
			{
				count++;
				
			}
			else if(arr[i]>=10 &&arr[i]<=99)
			{
				count1++;
			}
			else if(arr[i]>99 && arr[i]<=999)
			{
				count2++;
			}
		}
		
		System.out.println("1\n" + count);
		System.out.println("2\n" +count1);
		System.out.println("3\n"+count2);
		
		
	}
	public static void main(String[] args) {
		CountTheNumberOfDigits digits = new CountTheNumberOfDigits();
		Scanner sc = new Scanner(System.in);
		int sizeOfArray = sc.nextInt();
		if(sizeOfArray<0)
		{
			System.out.println("Invalid Array Size");
			System.exit(0);
		}
		int[] arr = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid Input");
			}
		}
		digits.findTheDigitCount(arr,sizeOfArray);
	}

}
