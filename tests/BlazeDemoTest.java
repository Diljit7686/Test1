import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest
{

	// Names 
	//    departure select: fromPort
	//    destination select: toPort
	// Classes
	//    find flights: btn5555
	

	final String CHROMEDRIVER_LOCATION = "/Users/cjb/Downloads/chromedriver";
	final String URL_TO_TEST = "http://blazedemo.com/";
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_LOCATION);
   //     driver = new ChromeDriver();
		driver.get(URL_TO_TEST);
		
        Thread.sleep(5000);
	}

	@After
	public void tearDown() throws Exception
	{
		
		Thread.sleep(9000);
        driver.close();
	}

	@Test
	public void TestFirst()
	{
        WebElement depart = driver.findElement(By.name("fromPort"));
        int num1 = depart.findElements(By.tagName("option")).size();
        assertEquals(7, num1);
	}

	@Test
	public void TestSecond() throws InterruptedException 
	{
        WebElement Btn1 = driver.findElement(By.tagName("input"));
        Btn1.click();
	
		
		WebElement Num2 = driver.findElement(By.name("VA12"));
//		WebElement num3 = (WebElement) ((JavascriptExecutor) driver).executeScript(
//                "return arguments[0].parentNode;", Num2);
//	//	List details = num3.findElements(By.tagName("td"));
//		String departTime = details.get(3).getText();
//		String arriveTime = details.get(4).getText();
//		String cost = details.get(5).getText();
//		
//		assertEquals("11:23 AM", departTime);
//		assertEquals("1:45 PM", arriveTime);
//		assertEquals("$765.32", cost);
	}

	@Test
	public void TestThird() throws InterruptedException 
	{
        WebElement btnbtn = driver.findElement(By.tagName("input"));
        btnbtn.click();
		Thread.sleep(1000);
		//jjjj
        WebElement btnFind = driver.findElement(By.tagName("input"));
        btnFind.click();
		Thread.sleep(1000);

        WebElement purchase = driver.findElement(By.className("btn-primary"));
        purchase.click();
		Thread.sleep(1000);
		
        WebElement allFlights = driver.findElement(By.tagName("table"));
//		List<WebElement> details = allFlights.findElements(By.tagName("tr"));
//		
//		String id = details.get(1).getText();
//		id = id.replace("Id ", "");
//		String date = details.get(7).getText();
//		
	
	}

}