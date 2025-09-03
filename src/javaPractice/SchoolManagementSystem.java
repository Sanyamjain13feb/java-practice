package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
	int id;
	String name;
	int grade;
	
	Student(int id,String name,int grade){
		this.id=id;
		this.name=name;
		this.grade=grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}

class Teacher{
	int id;
	String name;
	
	Teacher(int id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
}

class Course{
	int id;
	String name;
	
	
	Course(int id,String name){
		this.id=id;
		this.name=name;
	}


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class SchoolManagementSystem {
	
	List<Student> students=new ArrayList<>();
	List<Teacher> teachers=new ArrayList<>();
	List<Course> courses=new ArrayList<>();
	
	Scanner scanner=new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Enter Student ID,Name and Grade");
		int id=scanner.nextInt();
		String name=scanner.next();
		int grade=scanner.nextInt();
		students.add(new Student(id,name,grade));
	}
	
	public void addTeacher() {
		System.out.println("Enter the Teacher id and Name");
		int id=scanner.nextInt();
		String name=scanner.next();
		teachers.add(new Teacher(id,name));
		
	}
	
	public void addCourse() {
		System.out.println("Enter Course Id and Name");
		int id=scanner.nextInt();
		String name=scanner.next();
		courses.add(new Course(id,name));
		
	}
	public void printStudents() {
		System.out.println("Students:");
		students.forEach(System.out::println);
		
	}
	public void printTeachers() {
		System.out.println("Teachers");
		teachers.forEach(System.out::println);
		
	}
	public void printCourses() {
		System.out.println("Courses");
		courses.forEach(System.out::println);
	}
	

	public static void main(String[] args) {
		SchoolManagementSystem system=new SchoolManagementSystem();
		
		system.addStudent();
		system.addTeacher();
		system.addCourse();
		
		system.printStudents();
		system.printTeachers();
		system.printCourses();

	}

}
