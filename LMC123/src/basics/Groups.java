package basics;

import org.testng.annotations.Test;

public class Groups {
	@Test (groups = { "Functional","sanity" },priority=0)
	 
	  public void M2() {
	 
	   System.out.println("This is belongs to Functional test case2");
	 
	  }
	 
	  @Test (groups = { "Functional" },priority=1)
	 
	  public void M1() {
	 
	   System.out.println("This is belongs to Functional test case1");
	 
	  }
	 
	  @Test (groups = { "Sanity" },priority=2)
	 
	  public void M3() {
	 
	   System.out.println("This is belongs to Sanity test case");
	 
	  }


	  @Test (groups = { "Regressive" },priority=4)
	 
	  public void M5() {
	 
	   System.out.println("This is belongs to regressive test case");
	  }
	   @Test (groups = { "Regressive","Functional"},priority=4)
		 
		  public void Mr() {
		 
		   System.out.println("This is belongs to regressive test case");
		 
	 
	  }
	 
	 
	 
	}
