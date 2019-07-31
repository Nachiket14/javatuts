class ComplexTest
{
	public static void main(String []args)
	{
		Complex c1=new Complex(1,2);
		Complex c2=new Complex(3);
		Complex c3=new Complex();
		Complex c4=c1;
		Complex c5=new Complex(1,-2);

		c1.show();
		c2.show();
		c3.show();
		c4.show();
		c5.show();

		Complex c6=c1.add(c2);
		Complex c7=c2.add(c1);
		c6.show();
		c7.show();

		c1.inc().inc();
		c1.show();
	}
}
