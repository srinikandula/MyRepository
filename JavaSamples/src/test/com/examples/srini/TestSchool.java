package test.com.examples.srini;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.examples.srini.Student;

public class TestSchool {
	@Test(expected =IllegalArgumentException.class)
	public void gradeTest(){
		Student s = new Student();
		s.setMarks(75);
		String grade = s.getGrade();
		assertEquals(grade, "A");
		Student s1 = new Student();
		s.setMarks(50);
		assertEquals(s1.getGrade(), "B");	
	}
}
