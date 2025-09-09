package Loops;

import java.util.Scanner;

public class f37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.print(" "+i);
			}
			
		}
	}

}
