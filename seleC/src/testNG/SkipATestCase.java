package testNG;

import org.testng.annotations.Test;

public class SkipATestCase {
	
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the car");
	}
	
	@Test(priority=5, enabled=false)
	public void turnOnMusic() {
		System.out.println("Music Turned ON");
	}
	
	@Test(priority=1)
	public void firstGear() {
		System.out.println("First gear");
	}
	
	@Test(priority=2)
	public void secondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority=3)
	public void thirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority=4)
	public void fourthGear() {
		System.out.println("Fourth Gear");
	}

}
