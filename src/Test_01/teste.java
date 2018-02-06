package Test_01;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

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
		selectComboBox("//select[@name='fromPort']", "London");
		selectComboBox("//select[@name='fromMonth']", "1");
		selectComboBox("//select[@name='fromDay']","10");
		selectComboBox("//select[@name='toPort']", "Paris");
		selectComboBox("//select[@name='toMonth']", "12");
		selectComboBox("//select[@name='toDay']", "7");
		
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.name("airline")).sendKeys("Pangea Airlines");
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
		driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("teste");
		driver.findElement(By.name("passLast0")).sendKeys("teste");
		
		selectComboBox("//select[@name='pass.0.meal']", "HNML");
		
		driver.findElement(By.name("passFirst1")).sendKeys("teste");
		driver.findElement(By.name("passLast1")).sendKeys("teste");
		
		selectComboBox("//select[@name='pass.1.meal']", "VGML");
		selectComboBox("//select[@name='creditCard']", "IK");
		
		driver.findElement(By.name("creditnumber")).sendKeys("teste");
		driver.findElement(By.name("cc_exp_dt_mn")).sendKeys("02");
		
		selectComboBox("//select[@name='cc_exp_dt_yr']", "2001");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("teste");
		driver.findElement(By.name("cc_mid_name")).sendKeys("teste");
		driver.findElement(By.name("cc_last_name")).sendKeys("teste");
		
		driver.findElement(By.name("billAddress1")).clear();
		driver.findElement(By.name("billAddress1")).sendKeys("testando endereço");
		driver.findElement(By.name("billCity")).clear();
		driver.findElement(By.name("billCity")).sendKeys("teste campo city");
		driver.findElement(By.name("billState")).clear();
		driver.findElement(By.name("billState")).sendKeys("teste campo state");
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys("9000");
		
		selectComboBox("//select[@name='billCountry']", "11");
		
		driver.findElement(By.name("delAddress1")).clear();
		driver.findElement(By.name("delAddress1")).sendKeys("testando endereço 2");
		driver.findElement(By.name("delCity")).clear();
		driver.findElement(By.name("delCity")).sendKeys("teste campo city 2");
		driver.findElement(By.name("delState")).clear();
		driver.findElement(By.name("delState")).sendKeys("teste campo state 2");
		driver.findElement(By.name("delZip")).clear();
		driver.findElement(By.name("delZip")).sendKeys("9002");
		
		//selectComboBox("//select[@name='delCountry']", "ALBANIA ");
		driver.findElement(By.name("buyFlights")).click();		
		
		WebElement button;
		button = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img"));
						
		Assert.assertNotNull(button);
	}
	
	
	public void selectComboBox (String xpath, String value) {
		
			
		Select selectPassCount;
		selectPassCount = new Select(driver.findElement(By.xpath(xpath)));
		
		selectPassCount.selectByValue(value);						
	}

}
