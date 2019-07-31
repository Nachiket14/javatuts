class MatMult
{
	public static void main(String []args)
	{
		int [][]a={{1,2},{1,2}};
		int [][]b={{3,4},{3,4}};

		for(int i=0;i<a.length-1;i++)
		{
			if(a[i].length!=a[i+1].length)
			{
				System.err.println("A is not a matrix");
				System.exit(1);
			}
		}
		for(int i=0;i<b.length-1;i++)
		{
			if(b[i].length!=b[i+1].length)
			{
				System.err.println("B is not a matrix");
				System.exit(2);
			}
		}
		if(a[0].length!=b.length)
		{
			System.err.println("Multiplication not possible");
			System.exit(3);
		}

		int [][]c=new int [a.length][b[0].length];
		for(int i=0;i<c.length;i++)
			for(int j=0;j<c[i].length;j++)
				for(int k=0;k<b.length;k++)
					c[i][j]+=a[i][k]*b[k][j];

		for(int []row:c)
		{
			for(int col:row)
			{
				System.out.print(col+"\t");
			}
			System.out.println();
		}

		//System.exit(0);
	}
}
