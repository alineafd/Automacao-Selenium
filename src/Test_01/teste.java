package Test_01;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class teste {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		selectComboBox("//select[@name='passCount']", "2");
		
		
	}
	
	
	public void selectComboBox (String xpath, String value) {
		
		Select selectPassCount;
		selectPassCount = new Select(driver.findElement(By.xpath(xpath)));
		
		selectPassCount.selectByValue(value);						
	}

}
