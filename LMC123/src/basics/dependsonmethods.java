package basics;

import org.testng.annotations.Test;

public class dependsonmethods {
	@Test
	public void launch()
	{
		System.out.println("pretest");
		
	}
	@Test(dependsOnMethods="launch")
	public void Testing()
	{
		System.out.println("Testing");
		
	}
	@Test(dependsOnMethods={"launch","Testing"}, alwaysRun=true)
	public void close()
	{
		System.out.println("close");
		
	}
	

}
