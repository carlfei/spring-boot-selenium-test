package example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.assertj.core.api.Assertions.assertThat;


public class SeleniumTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("web-driver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://localhost:8080");
	}

	@Test
	public void testLocalHostPage() throws InterruptedException {

		Thread.sleep(2000);

		final WebElement test1 = driver.findElement(By.linkText("Dropdown testing"));
		test1.click();

		Thread.sleep(2000);

		final WebElement test2 = driver.findElement(By.linkText("testing 2"));
		test2.click();

		Thread.sleep(2000);

		final String restUri = driver.getCurrentUrl();
		assertThat(restUri).endsWith("/testing/2");


	}


	@After
	public void tearDown() {
	//	driver.quit();
	}

}
