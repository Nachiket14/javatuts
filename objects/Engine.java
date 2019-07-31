class Engine
{
	int cyl;
	int cc;

	void setCyl(int cyl) { this.cyl=cyl; }
	int getCyl() { return this.cyl; }

	void setCC(int cc) { this.cc=cc; }
	int getCC() { return this.cc; }

	void show()
	{
		System.out.println("Engine : Cyl="+this.cyl+", CC="+this.cc);	
	}
}