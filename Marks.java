class Marks
{
	public static void main(String []args)
	{
		int [][]batchmarks={{60,70,80,90},{100,90,80}};
		String []batches={"TECSE","TEIT"};

		float []avgs=new float[batchmarks.length];

		for(int batch=0;batch<batchmarks.length;batch++)
		{
			//for(int marks:batchmarks[batch])
			for(int i=0;i<batchmarks[batch].length;i++)
			{
				int marks=batchmarks[batch][i];
				avgs[batch]+=marks;
			}
			avgs[batch]/=batchmarks[batch].length;
		}

		for(int batch=0;batch<batches.length;batch++)
		{
			System.out.println(
				"Average marks of batch "+
				batches[batch]+
				" is "+
				avgs[batch]);
		}
	}
}