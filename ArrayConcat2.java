class ArrayConcat2
{
	public static void main(String []args)
	{
		int []a={100,200,300};
		int []b={40,50,60,70};

		int c[];

		c=new int[a.length+b.length];
		
		for(int i=0;i<c.length;i++)
		{
			c[i]=(i<a.length)?a[i]:b[i-a.length];
		}

		System.out.println(java.util.Arrays.toString(c));
	}
}
