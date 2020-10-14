package sort;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;

public class StudentSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details of those students");
		int flag=0;
		ArrayList<Student> a1=new ArrayList<>();
		ArrayList<Student> a2=new ArrayList<>();
		
		TreeSet<Student> ts = new TreeSet<>();
		do {
		System.out.println("Enter the ID,Name,Marks of Students");
		Student s=new Student();
		s.setId(sc.nextInt());
		sc.nextLine();
		s.setName(sc.nextLine());
		s.setMarks(sc.nextInt());
		ts.add(s);
		a1.add(s);
		a2.add(s);
		
		System.out.println("0.Continue  1.Exit");
		flag=sc.nextInt();
		}while(flag==0);
		
		System.out.println("Contents of TreeSet");
		for(Student s:ts) {
			s.print();
		}
		
		
		System.out.println("Contents of TreeSet after using Comparator");
		for(Student s:ts) {
			s.print();
		}
		
		
		System.out.println("Contents of ArrayList at the beginning");
		for(Student s:a1) {
			s.print();
		}
		
		System.out.println("Contents of ArrayList after sorting based on marks");
		Collections.sort(a2,new StudentMarksSorter());
		for(Student s:a2) {
			s.print();
		}
		
		System.out.println("Contents of ArrayList after sorting based on id");
		Collections.sort(a1);
		for(Student s:a1) {
			s.print();
		}
		
	}

}
