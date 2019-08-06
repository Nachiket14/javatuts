class Outer
{
	int oi;
	static int osi;


	class Inner
	{
		int ii;
		//static int isi;

		void e()
		{
			oi=0;  //Changed to this$0.oi=0;
			osi=0;
			ii=0;
			int x=oi;
		}
	}


}