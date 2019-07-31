class Car
{
	int price;
	Engine engine;

	int getPrice() { return this.price; }
	void setPrice(int price) { this.price=price; }

	Engine getEngine() { return this.engine; }
	void setEngine(Engine engine) { this.engine=engine; }

	void show()
	{
		System.out.println("Car : Price="+this.price);	
		this.engine.show();
		System.out.println("-----------------");
	}
}
