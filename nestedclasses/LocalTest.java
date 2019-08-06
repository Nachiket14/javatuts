class Outer
{
	int oi;
	static int osi;

	void e()
	{
		int ei=0;
		final int efi=100;

		class Local
		{
			int li=0;
			//static int lsi=0;  //Can't define static in local context

			void f()
			{
				oi=0;
				osi=0;
				//ei=0;
				System.out.println(efi);
				li=0;
			}
		}

		Local l=new Local();
		l.f();
	}
}

class LocalTest
{
	public static void main(String []args)
	{
		Outer o=new Outer();
		
	}
}
