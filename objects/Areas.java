class Length
{
	double val;
	String unit;
	Length(double v,String u)
	{
		this.val=v;
		this.unit=u;
	}
}

class Area
{
	double value;
	String unit;
	Area(double v,String u)
	{
		this.value=v;
		this.unit=u;
	}
	void show()
	{
		System.out.println(value+" "+unit);
	}
}

class Rect
{
	Length width;
	Length height;
	void setWidth(Length l)
	{
		this.width=l;
	}
	Length getWidth()
	{
		return this.width;
	}

	void setHeight(Length height)
	{
		this.height=height;
	}

	Length getHeight() { return this.height; }

	
	Area getArea()
	{
		double d;
		d=this.width.val*this.height.val;
		String s;
		s=width.unit+"."+height.unit;
		Area a=new Area(d,s);
		return a;

		//return new Area(width.val*height.val,width.unit+"."+height.unit);
	}
}

class Areas
{
	public static void main(String []args)
	{
		Rect r=new Rect();

		r.setWidth(new Length(10,"m"));
		r.setHeight(new Length(5,"cm"));

		Area a=r.getArea();

		a.show();   // 50 m.cm
	}
}