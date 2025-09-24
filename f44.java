package Loops;

//Print all palindrome numbers between 1 and 500

public class f44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=500,no=0,d=0,rev=0,n1=0;
		for(int i=1;i<=500;i++)
		{
			d=0;
			rev=0;
			n1=i;
			no=i;
			while(no>0)
			{
				d=no%10;
				rev=rev*10+d;
				no=no/10;
			}
			
			if(n1==rev)
			{
				System.out.print(" "+i);
			}
		}
	}

}
