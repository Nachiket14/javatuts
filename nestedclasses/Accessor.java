class Container
{
	private int secret;

	Container(int secret) { this.secret=secret; }

	void setSecret(int secret) { this.secret=secret; }
	int getSecret() { return this.secret; }

	class SecretDoor
	{
		int getSecret()
		{
			return secret;
		}
	}
}

class Accessor
{
	public static void show(Container.SecretDoor d)
	{
		//d.setSecret(10000);
		System.out.println("Secret is = "+d.getSecret());
	}

	public static void main(String []args)
	{
		Container c1=new Container(100);
		Container c2=new Container(200);


		Container.SecretDoor d1=c1.new SecretDoor();
		Container.SecretDoor d2=c2.new SecretDoor();


		show(d2);
	}
}