/*
0(optional) - Standard Input
1(optional) - Standard Output
2 - Standard Error

*/

class StandardStreams
{
	public static void main(String []args)
	{
		//System.out.println("Output");
		//System.err.println("Error");

		java.util.Scanner s=new java.util.Scanner(System.in);

		int i=s.nextInt();
		System.out.println(i);
	}
}
