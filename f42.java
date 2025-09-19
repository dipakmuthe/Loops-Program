package Loops;

public class f42 {

	public static void main(String[] args) {
	
		int n=100,flag=0;
		for(int i=1;i<=n;i++)
		{
			flag =0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag =1;
				}
				
				
			}
			if(flag==0)
			{
				System.out.println(" "+i);
			}
			
		}
	}

}
