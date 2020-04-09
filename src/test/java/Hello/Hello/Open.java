package Hello.Hello;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Open 
{

	@BeforeTest
	public void m1()
	{
		System.out.println("hello himanshu");
	}
	@Test
	public static void hello()
	{
		System.out.println("hello");
	}

}
