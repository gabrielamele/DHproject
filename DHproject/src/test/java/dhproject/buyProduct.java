package dhproject;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buyProduct {
	private WebDriver driver;

By homeBtnLinkLocator = By.name("Submit");

By cartLocator = By.id("layer_cart");

By proceedToCheckoutLocator = By.xpath ("//a[@text='Proceed to checkout']");

//////
By proceedBtnLocator = By.linkText("Proceed to checkout");
By homeProceedLocator = By.className("clearfix");

@Before
public void setUp() {
	
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?id_product=2&controller=product\\");

}

@Test	
	
	public void realizarCompra() {
		
		driver.findElement(homeBtnLinkLocator).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(cartLocator).isDisplayed()) {
			driver.findElement(proceedToCheckoutLocator).click();
		}
		else {
			System.out.print("emergente no encontrada");
		}
	}

@After

public void tearDown() {
	//driver.quit();
}
}
