import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {
    
    private String name;
    private ArrayList<Module> modules = new ArrayList();
    private ArrayList<Student> students = new ArrayList();
    private DateTime startDate;
    private DateTime endDate;
    
    
    public Course(String name, DateTime startDate, DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
     public String getName() {
        return name;
    }

    
    public DateTime getStartDate() {
        return this.startDate;
    }

    public DateTime getEndDate() {
        return this.endDate;
    }
    
    
    public boolean addStudent( Student newStudent ) {
      students.add( newStudent );
         
      return true;
   }
    
     public boolean addModule( Module newModule ) {
      modules.add( newModule );
      return true;
   }
}
