package sort;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	void print() {
		System.out.print("Id=" + id+"  ");
		System.out.print("Name=" + name+"  ");
		System.out.print("Marks=" + marks+"  ");
		System.out.println();
	}
	
	@Override
	public int compareTo(Student o) {
		//System.out.println(" Sorting on basis of ID Using Comparable Interface");
		if (this.id < o.id)
			return -1;
		else if (this.id > o.id)
			return 1;
		return 0;
	}
	
	
}
