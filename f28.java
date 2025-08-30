package Loops;

import java.util.Scanner;

public class f28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to check palindrom::");
		int n=sc.nextInt();
		int d=0,n1=n;int r=0;
		while(n>0)
		{
			d=n%10;
			r=r*10+d;
		}
	}

}
