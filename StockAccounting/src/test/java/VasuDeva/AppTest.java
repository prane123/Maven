package VasuDeva;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest 
  
{
   @Test
   public void mavenSample()
   {
	   FirefoxDriver driver=new FirefoxDriver();
	   driver.get("Http://Amazon.in");
   }
}
