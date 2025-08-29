package Loops;

import java.util.Scanner;

public class f27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NUmber::");
		int n=sc.nextInt();
		int d=0,c=0;
		while(n>0)
		{
			d=n%10;
			System.out.print(""+d);
			n=n/10;
		}
		
	}

}
