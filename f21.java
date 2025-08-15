package Loops;

//Print only prime numbers between 1 and 50.

public class f21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=50;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					System.out.println("Number is Not Prime");
					break;
				}
				else
				{
					continue;
				}
			}
			
		}
	}

}
