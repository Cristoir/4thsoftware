package nuigalway.app.src;

import java.util.ArrayList;

public class Module {

	private  String code;
	private ArrayList<Student> students = new ArrayList();
	private ArrayList<Course> courses = new ArrayList();
	
	
	public Module(String code) {
		this.code = code;
	}
    
    public String getModCode(){
        return code;
    }
    
     public boolean addStudent( Student newStudent ) {
      students.add( newStudent );
         
      return true;
   }
    
     public boolean addCourse( Course newCourse ) {
      courses.add( newCourse );
      return true;
   }
}
