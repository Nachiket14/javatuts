class MatTranspose
{
	public static void main(String []args)
	{
		int [][]a={{1,2,3,4},{5,6,7,8}};

		int [][]b=new int [a[0].length][a.length];

		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}

		for(int []row:b) { for(int col:row) { System.out.print(col+"\t"); } System.out.println(); }
	}
}
