class Rect
{
	int w,h;


	Rect()
	{
		this(0);
		System.out.println("R0");
	}

	Rect(int side)
	{
		this(side,side);
		System.out.println("R1");
	}

	Rect(int w, int h)
	{
		this.w=w;
		this.h=h;
		System.out.println("R2");
	}

	void showArea()
	{
		int area=this.w*this.h;
		System.out.println("Area of rect is "+area);
	}
}
