class CarTest
{
	public static void main(String []args)
	{
		Engine e1=new Engine();
		e1.setCyl(8);
		e1.setCC(2000);

		Engine e2=new Engine();
		e2.setCyl(10);
		e2.setCC(3000);

		Car c1=new Car();
		c1.setPrice(1_000_000);
		c1.setEngine(e2);

		Car c2=new Car();
		c2.setPrice(20_00_000);
		c2.setEngine(e1);

		c1.show();
		c2.show();

		Engine c1e=c1.getEngine();
		c1e.setCyl(6);
		c1.show();

		c2.getEngine().setCyl(12);
		c2.show();
	}
}