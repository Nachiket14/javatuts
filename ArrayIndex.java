/*

Valid array indices - 0 to length-1

If array index is out of range of valid indices then ArrayIndexOutOfBoundsException will be thrown

Internal Data types of arrays

int []		- [I
long []		- [J
byte[]		- [B
char[]		- [C
short[]		- [S
float[]		- [F
double[]	- [D
boolean[]	- [Z

<class>[]	- L[<class>;
*/


class ArrayIndex
{
	public static void main(String []args)
	{
		int []a={10,20,30};
		System.out.println("Length of array = "+a.length);

		//a.length=10;
	
		for(int i=0;i<=a.length;i++)
		{
			System.out.print("Accessing index "+i+" => ");
			System.out.println(a[i]);
		}

		//a[-1]=0;


		a(null);
		System.out.println("End of program");
	}

	public static short[] a(boolean []a)
	{
		return null;
	}
}
