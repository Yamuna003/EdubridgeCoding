package Edubridgepractice;

import java.util.Scanner;

 
public class SumOfDivisibleByGivenNumber {
	
	  public int findSumOfGivenDivisibleNumber(int number, int givenDivisibleNumber)
	   {
		   int sum =0;
		  if(number<0 || givenDivisibleNumber<0)
		  {
			  return -1;
		  }
		  else
		  {
			  for(int i=0;i<number;i++)
			  {
				  if(i%givenDivisibleNumber==0)
				  {
					  sum = sum + i;
				  }
				  
			  }
		  }
		  return sum;
	   }
	public static void main(String[] args) {
		SumOfDivisibleByGivenNumber sum = new SumOfDivisibleByGivenNumber();
		Scanner sc = new Scanner(System.in);
		int  number = sc.nextInt();
		int  givenDivisibleNumber = sc.nextInt();
		int count = -1;
		if(sum.findSumOfGivenDivisibleNumber(number,givenDivisibleNumber)==count)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println(sum.findSumOfGivenDivisibleNumber(number,givenDivisibleNumber));
		}
}
}

