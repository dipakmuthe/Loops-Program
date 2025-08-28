package Loops;

import java.util.Scanner;

//Find the sum of digits of a number

public class f26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NUmber::");
		int n=sc.nextInt();int s=0;
		int d=0;
		while(n>0)
		{
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("Sum of digit is ::"+s);
	}

}
