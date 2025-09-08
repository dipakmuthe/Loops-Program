package Loops;

import java.util.Scanner;

public class f35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		int d=0,c=0;
		while(n>0)
		{
			d=n%10;
			if(d%2==0)
			{
				c++;
			}
			
			n=n/10;
		}
		System.out.println("The Even COunt of digit is ="+c);
		
	}

}
