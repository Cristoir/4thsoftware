import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private int DOB;
	private int ID;
	private String userName;
	private ArrayList<Module> modules = new ArrayList();
	private ArrayList<Course> courses = new ArrayList();
	
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

	
  public boolean addModule( Module newModule ) {
      modules.add( newModule );
      module.addStudent(this);
      return true;
   }
    
    public boolean addCourse( Course newCourse ){
        courses.add(newCourse);
        
        return true;
    }
	
}
