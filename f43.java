package Loops;

public class f43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(i==sum)
			{
				System.out.print(" "+i);
			}
		}
	}

}
