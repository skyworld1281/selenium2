package basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example {
	@Test(dataProvider="datapro")
	public void setup(String name)
	{
		System.out.println(name);
	}

   @DataProvider(name="DT")
    public Object[][] datapro()
	{
	   return new Object[][]
						{
			              
					{"sumanth"},
					{"krishna"}
	};
	}

}
