import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindradioButton { 

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rkulk\\OneDrive\\Desktop\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//Click on every radio button>>>>>>>
		
		List<WebElement>button=driver.findElements(By.xpath("//input[@name=\"color\"]"));
		for(int m=0;m<button.size();m++) {
			System.out.println(m);
			Thread.sleep(2000);
			button.get(m).click();
			
			System.out.println("--------------------------");
			System.out.println("select radio button");
			
			driver.manage().window().maximize();
			
			
		}
		
		WebElement color=driver.findElement(By.xpath("(//input[@name=\"color\"])[5]"));
		
		color.click();
		
		if(color.isSelected()) {
			System.out.println("Purple Radio button selected");
			
		}
		else {
			System.out.println("Purple Radio button not selected");
			
		}
		//driver.quit();
		
	

	}

}
