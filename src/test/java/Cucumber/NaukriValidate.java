package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Java_Automation.Maven_TestNG.Constant;
import io.cucumber.java.en.Given;

public class NaukriValidate {
	WebDriver driver = new ChromeDriver();

//	@
	@Given("^Opens Naukri url$")
	public void login() throws InterruptedException {
		// this.driver = new ChromeDriver();
		driver.get(Constant.BASE_URL_Naukri);
		driver.manage().window().maximize();
		System.out.println("Url is opening");
		System.out.println("New Code IS Added");
		System.out.println("New Code IS Added");
		System.out.println("New Code IS Added");

		System.out.println("Abhilashhhh");
		Thread.sleep(5000);
	}

}
