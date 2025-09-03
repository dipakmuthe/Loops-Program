package Loops;

import java.util.Scanner;

public class f32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int d=0,n1=n,max=0;
		while(n>0)
		{
			d=n%10;
			if(max<d)
			{
				max=d;
			}
			n=n/10;
		}
		System.out.println("Greatest no is ::"+max);
	}

}
