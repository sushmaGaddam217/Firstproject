package seleniumtraining;

import org.testng.annotations.Test;

public class testpriority {
	
	@Test (priority=1)
	public void test1()
	{
		System.out.println("priority1 test");
	}

	@Test (priority=1)
	public void abc()
	{
		System.out.println("priority1 abc");
	}
	
	@Test (priority=1)
	public void xyz()
	{
		System.out.println("priority1 xyz");
	}
	
	@Test (priority=3)
	public void test2()
	{
		System.out.println("priority3");
	}
	
	
	@Test
	public void atest3()
	{
		System.out.println("no priority");
	}
	
	@Test (priority=1)
	public void hyz()
	{
		System.out.println("priority1 hyz");
	}
}
