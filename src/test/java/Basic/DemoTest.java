package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
@Test
public void FacebookTest()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
}
@Test(groups="Food")
public void swiggy()
{
	WebDriver  driver = new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
}
@Test (groups="Food")
public void zomato()
{
	WebDriver  driver = new ChromeDriver();
	driver.get("https://www.zomato.com/");
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
}

	
}
