package Loops;

import java.util.Scanner;

public class f33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int d=0,n1=n,min=10;
		while(n>0)
		{
			d=n%10;
			if(min>d)
			{
				min=d;
			}
			n=n/10;
		}
		System.out.println("Smallest no is ::"+min);
	}

}
