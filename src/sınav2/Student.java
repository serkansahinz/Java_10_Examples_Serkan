package sınav2;

import javax.management.loading.PrivateClassLoader;

public class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		Student student = new Student("Ahmet");
		System.out.println(student.name);

	}

}
