package aa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeSample
	{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vinod\\eclipse-workspace\\aa\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://duckduckgo.com/");

	WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

	
	String typeValue=searchTextBox.getAttribute("type");
	System.out.println("Value of type attribute: "+typeValue);

	String autocompleteValue=searchTextBox.getAttribute("autocomplete");
	System.out.println("Value of autocomplete attribute: "+autocompleteValue);

	String nonExistingAttributeValue=searchTextBox.getAttribute("nonExistingAttribute");
	System.out.println("Value of nonExistingAttribute attribute: "+nonExistingAttributeValue);

	}
	}

