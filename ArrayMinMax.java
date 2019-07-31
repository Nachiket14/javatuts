class ArrayMinMax
{
	public static void main(String []args)
	{
		int []a={10,20,2,50,500,100};

		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

		for(int i:a)
		{
			if(i<min) min=i;
			if(i>max) max=i;
		}

		System.out.println("Min="+min);
		System.out.println("Max="+max);
		System.out.println("Integer Min="+Integer.MIN_VALUE);
		System.out.println("Integer Max="+Integer.MAX_VALUE);
		System.out.println("Long Min="+Long.MIN_VALUE);
		System.out.println("Long Max="+Long.MAX_VALUE);
	}
}