class ArrayRev
{
	public static void main(String []args)
	{
		int []a={1,2,3,4,5};

		for(int i=0;i<=a.length/2;i++)
		{
			int t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}

		System.out.println(a);

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println(java.util.Arrays.toString(a));
	}
}