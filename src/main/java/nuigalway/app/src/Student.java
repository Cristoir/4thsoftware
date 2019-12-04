package nuigalway.app.src;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private int ID;
	private String userName;
	private ArrayList<Module> modules = new ArrayList();
	private ArrayList<Course> course = new ArrayList();
	
	public Student(String name, int age, String DOB, int ID) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.userName = setUserName(name, age);
		
	}

	

	public static String setUserName(String name, int age) {
		return name+age;
	}

	
  public boolean addModule( Module newModule ) {
      modules.add( newModule );
      
      return true;
   }
    
    public boolean addCourse( Course newCourse ){
        course.add(newCourse);
        
        return true;
    }
	
}
