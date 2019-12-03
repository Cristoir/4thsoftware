import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private int DOB;
	private int ID;
	private String userName;
	private ArrayList<Module> modules = new ArrayList();
	private ArrayList<Course> course = new ArrayList();
	
	public Student(String name, int age, int DOB, int ID) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.userName = setUserName(name, age);
		
	}

	

	public String setUserName(String name, int age) {
		return name+age;
	}

	
  public boolean addModule( Module newModule ) {
      modules.add( newModule );
      Module.addStudent(this);
      return true;
   }
    
    public boolean addCourse( Course newCourse ){
        course.add(newCourse);
        
        return true;
    }
	
}
