package testNG;

import org.testng.annotations.Test;

public class DependenciesManagment {
	
	@Test(enabled=true)
	public void highSchool() {
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("Higher Secondary School");
	}
	
	@Test(dependsOnMethods="higherSecondary",enabled=false)
	public void engineering() {
		System.out.println("College");
	}

}
