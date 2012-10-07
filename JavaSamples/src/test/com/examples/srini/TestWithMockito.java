package test.com.examples.srini;

import java.sql.Connection;
import java.util.Iterator;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;
public class TestWithMockito extends TestCase {
	
	public void testHelloWorld(){
		//arrange
		Iterator i=mock(Iterator.class);
		when(i.next()).thenReturn("Hello").thenReturn("World");
		//act
		String result=i.next()+" "+i.next();
		//assert
		assertEquals("Hello World", result);
	}
	public void testJDBC(){
		//arrange
		Connection con=mock(Connection.class);
		DriverManager.get
		when(con.getc).thenReturn("Hello").thenReturn("World");
		//act
		String result=i.next()+" "+i.next();
		//assert
		assertEquals("Hello World", result);
	}
	
}
