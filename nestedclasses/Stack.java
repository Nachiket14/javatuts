class Stack
{	
	Node tos;

	private static class Node
	{
		double value;
		Node next;

		Node(double value) { this.value=value; }
	}

	class Traverser
	{
		void traverse()
		{
			Node n=tos;
			while(n!=null)
			{
				System.out.println("Traversed : "+n.value);
				n=n.next;
			}
		}
	}

	void push(double value)
	{
		Node n=new Node(value);
		n.next=tos;
		tos=n;
	}

	double pop()
	{
		if(tos==null)
		{
			System.err.println("Stack undeflow");
			return Double.NaN;
		}
		double value=tos.value;
		tos=tos.next;
		return value;
	}

}

class StackTest
{
	public static void main(String []args)
	{
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		s.push(30);

		Stack.Traverser t=s.new Traverser();
		t.traverse();

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}


