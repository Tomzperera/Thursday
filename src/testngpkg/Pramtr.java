package testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Pramtr {
	
	@Parameters({"Tool"})
	@Test
	public void startt(String Tool) {
		System.out.println("value:"+Tool);
	}

}
