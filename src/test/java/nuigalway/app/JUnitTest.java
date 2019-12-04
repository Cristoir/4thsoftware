package nuigalway.app;
import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;

import nuigalway.app.src.Student;

public class JUnitTest {

	Student student = new Student("Chris", 20, "01/01/1998", 16123456);
	
	String userName = Student.setUserName("Chris", 20);
	String expectedUsername = "Chris20";
	
	@Test
	public void testUserName() {
		assertEquals(userName, expectedUsername);
	}
	
}
