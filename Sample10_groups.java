package pac1;

import org.testng.annotations.Test;

public class Sample10_groups {
	@Test(groups= ("smoke"), priority=4)
	public void test1() {
		System.out.println("This is smoke test 1");
	}
	
	@Test (groups= ("regression"), priority=3, enabled=false)
	public void test2() {
		System.out.println("This is regression test 1");
	}
	
	@Test (groups= ("regression"), priority=2)
	public void test3() {
		System.out.println("This is regression test 2");
	}
	
	@Test (groups= ("smoke"), priority=1)
	public void test4() {
		System.out.println("This is smoke test 2");
	}
}
