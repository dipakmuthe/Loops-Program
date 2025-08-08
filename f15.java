package Loops;

//Calculate the sum of numbers divisible by 7 between 1 and 50.

public class f15 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1;i<=50;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of no divisible by 7::"+sum);
	}

}
