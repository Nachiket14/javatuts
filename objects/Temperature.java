class Celcius
{
	double c;
	Celcius()
	{
	}
	Celcius(double c)
	{
		this.c=c;
	}
	void setValue(double val)
	{
		this.c=val;
	}
	double getValue()
	{
		return c;
	}

	Fahrenheit toFahrenheit()
	{
		//this.c=(f-32)/1.8;
		double f=this.c*1.8+32;
		Fahrenheit fh=new Fahrenheit(f);
		return fh;
	}

	void show()
	{
		System.out.println(this.c+"°C");
	}
}

class Fahrenheit
{
	double f;
	Fahrenheit()
	{
	}
	Fahrenheit(double f)
	{
		this.f=f;
	}
	void setValue(double val)
	{
		this.f=val;
	}
	double getValue()
	{
		return f;
	}
	Celcius toCelcius()
	{
		//double c=(this.f-32)/1.8;
		//Celcius ch=new Celcius(c);
		//return ch;

		return new Celcius((this.f-32)/1.8);

	}

	void show()
	{
		System.out.println(this.f+"°F");
	}

}

class Temperature
{
	public static void main(String []args)
	{
		Celcius c1=new Celcius(100);

		Celcius c2=new Celcius();
		c2.setValue(-40);

		Fahrenheit f1=new Fahrenheit(0);

		Fahrenheit f2=c1.toFahrenheit();
		Celcius c3=f2.toCelcius();

		c1.show();  // 100°C
		c2.show();  // -40C
		c3.show();  // 100C
		f1.show();  // 0F
		f2.show();  // 212F


	}
}

/*
   F = C*1.8+32
   C = (F-32)/1.8
*/
