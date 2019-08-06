class Outer
{
	int oi;
	private static int osi;


	static class Nested
	{
		int ni;
		static int nsi;

		void e()
		{
			//oi=0;
			osi=0;  //Changed to Outer.osi=0;
			ni=0;
			nsi=0;

			int x=osi;
		}
	}
}

class NestedTest
{
	public static void main(String []args)
	{
		Outer o=new Outer();
		Outer.Nested n=new Outer.Nested();

		//n.oi=0;
		//n.osi=0;
		n.ni=0;
		n.nsi=0;  //Changed to Outer.Nested.nsi=0;
 	}
}