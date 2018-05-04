package com.titan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;
import com.titan.IntegrationTest;
@Category(IntegrationTest.class)
public class EmployeeGALIT {
	static WebDriver driver;
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Sandeep\\\\MyWebProject\\\\geckodriver\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		// new FirefoxDriver();
	}

	@AfterClass
	public static void cleanUp() {
		driver.quit();
	}
	
	@Test
	public void loginSuccess() {
        driver.get("http://localhost:6080/EmployeeGAL");
        WebElement userid = driver.findElement(By.name("userid"));
        WebElement pass = driver.findElement(By.name("password"));
        WebElement button = driver.findElement(By.xpath("/html/body/form/div/button"));         
        userid.sendKeys("sa346317");
        pass.sendKeys("1234");
        button.click();
        assertTrue(driver.getPageSource().contains("Home Page"));
	}
	@Test
	public void GetUserDetailsSuccess() {
        driver.get("http://localhost:6080/EmployeeGAL/Home.jsp");
        WebElement userid = driver.findElement(By.name("userid"));        
        WebElement button = driver.findElement(By.xpath("/html/body/form/button"));         
        userid.sendKeys("sa346317");
        button.click();
        assertTrue(driver.getPageSource().contains("Employee Details"));
	}	
	
}
