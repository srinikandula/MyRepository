package test.com.examples.srini;

import com.examples.srini.Student;

import junit.framework.TestCase;

public class TestGradeBook extends TestCase {
	
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
	public void testAGrade(){ 
		Student s = new Student();
		s.setMarks(75);
		String grade = s.getGrade();
		assertEquals(grade, "A");
		Student s1 = new Student();
		s.setMarks(50);
		assertEquals(s1.getGrade(), "B");		
	}
	public void something(){
		
	}
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
}
