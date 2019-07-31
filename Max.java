import java.util.Scanner;

class Max
{
	public static void main(String []args)
	{
		int a=0,b=0,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers :");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int max=a;
		if(a>b && a>c)
		{
			max=a;
		}
		else if(b>c)
		{
			max=b;
		}
		else
		{
			max=c;
		}

		System.out.println("Max number is "+max);

	}
}