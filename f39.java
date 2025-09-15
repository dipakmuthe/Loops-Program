package Loops;

import java.util.Scanner;

public class f39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int flag =0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				
			}
			
		}
		if(flag==1)
		{
			System.out.println("NUmber is not prime");
		}
		else
		{
			System.out.println("NUmber is  prime");
		}
	}

}
