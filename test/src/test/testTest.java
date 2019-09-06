package test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testTest 
{

private test t;
	@BeforeEach
	public void setUp() throws Exception 
	{
		t=new test();
	}

	@AfterEach
	public  void tearDown() throws Exception 
	{
		t=null;
	}

	@Test
	public void testAdd() 
	{
		int i =t.add(2,3);
		assert i>5:"result should not be greter than 5";
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSub() 
	{
		System.out.println("Not yet implemented");
	}

}
