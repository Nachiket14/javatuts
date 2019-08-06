class Student
{
	private int roll;
	private String name;
	private int []marks=new int[5];
	private boolean scholarship;
	private boolean passed;

	void setRoll(int roll) { this.roll=roll; }
	int getRoll() { return this.roll; }

	void setName(String name) { this.name=name; }
	String getName() { return this.name; }

	//void setMarks(int []marks) { this.marks=marks; }
	//int [] getMarks() { return this.marks; }

	//indexer
	void setMarks(int pos, int marks) { this.marks[pos]=marks; }
	int getMarks(int pos) { return this.marks[pos]; }

	void setScholarship(boolean scholarship) { this.scholarship=scholarship; }
	boolean hasScholarship() { return this.scholarship; }

	void setPassed(boolean passed) { this.passed=passed; }
	boolean isPassed() { return this.passed; }
	boolean getPassed() { return this.passed; }
}


class Circle
{
	private double radius;

	double getRadius() { return this.radius; }
	void setRadius(double radius} { this.radius=radius; }

	double getArea() { return Math.PI*radius*radius; }
	void setArea(double area) { this.radius=Math.sqrt(area/Math.PI); }
}

