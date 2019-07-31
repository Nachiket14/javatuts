import java.util.*;

class ArrayTest
{
	public static void main(String []args)
	{
		int []a=new int[10];

		for(int i=0;i<a.length;i++)
		{
			a[i]++;
			System.out.println(a[i]);
		}
		System.out.println("----------");
		for(int i:a)
		{
			i++;
			System.out.println(i);
		}
		System.out.println(Arrays.toString(a));
	}
}
