package Loops;

public class f30 {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1, c=0;
		System.out.println("Fibonacci Sereis ::");
		System.out.print(" "+a+" "+b);
		for(int i=1;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}

	}

}
