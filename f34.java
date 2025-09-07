package Loops;

import java.util.Scanner;

//Count the number of digits in a number.

public class f34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int d=0,c=0;
		while(n>0)
		{
			d=n%10;
			c++;
			n=n/10;
		}
		System.out.println("The COunt of digit is ="+c);
	}


}
