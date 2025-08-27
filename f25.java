package Loops;

import java.util.Scanner;

public class f25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NUmber to find factorial::");
		int n=sc.nextInt();
		int f=1;
		int i=1;
		while(i<=n)
		{
			f=f*i;
			i++;
		}
		System.out.println("Facorial::"+f);
	}

}
