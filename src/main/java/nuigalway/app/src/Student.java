import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private int DOB;
	private int ID;
	private String userName;
	private ArrayList<Module> modules = new ArrayList();
	private Course course;
	
	public Student(String name, int age, int DOB, int ID, Course course) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.userName = setUserName(name, age);
		this.course = course;
	}

	

	public String setUserName(String name, int age) {
		return name+age;
	}

	

	
}
