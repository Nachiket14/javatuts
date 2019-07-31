class Complex
{
	double real,imag;

	Complex()
	{
		this(0);
	}

	Complex(double real)
	{
		//this.real=real;
		//this.imag=0;

		this(real,0);
	}

	Complex(double real, double imag)
	{
		this.real=real;
		this.imag=imag;
	}

	void show()
	{
		System.out.println(this.real+(this.imag<0?"":"+")+this.imag+"i");
	}
	
	Complex add(Complex x)
	{
		double real=this.real+x.real;
		double imag=this.imag+x.imag;

		Complex r=new Complex(real,imag);

		return r;
	}

	Complex inc()
	{
		this.real++;
		return this;
	}
}