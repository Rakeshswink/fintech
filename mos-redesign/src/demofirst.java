import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class demofirst {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (11)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://sandbox-fintech.com/mosv1");
		

	}

}
