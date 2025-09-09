package Loops;

import java.util.Scanner;

public class f38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of factors ="+sum);
	}

}
