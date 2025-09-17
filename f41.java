package Loops;

import java.util.Scanner;

public class f41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int n1=n,d=0,f=1,sum=0;;
		while(n>0)
		{
			d=n%10;
			f=1;
			for(int i=1;i<=d;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			n=n/10;
		}
		if(sum==n1)
		{
			System.out.println("Number is Strong...");
		}
		else
		{
			System.out.println("Number is not Strong");
		}
		
	}

}
