package sort;
import java.util.Comparator;
public class StudentMarksSorter implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		//System.out.println("Sorting students on basis of marks using Comparator Interface");
		if (o1.marks < o2.marks)
			return -1;
		else if (o1.marks > o2.marks)
			return 1;
		return 0;
	}
}
