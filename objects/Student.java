class Student
{
	int roll;
	int marks;

	int getRoll()
	{
		return this.roll;
	}
	void setRoll(int roll)
	{
		this.roll=roll;
	}

	int getMarks()
	{
		return this.marks;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}

	void show()
	{
		System.out.println("Roll no. "+this.roll+" Marks="+this.marks);
	}
}

class StudentTest
{
	public static void main(String []args)
	{
		Student s1=new Student();
		s1.setMarks(60);
		s1.setRoll(1);

		s1.show();
	}
}
