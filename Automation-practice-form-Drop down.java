package Testiranje;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
/*
 * Domaci
Zadatak4:
1. Launch new Browser
2. Open “http://toolsqa.wpengine.com/automation-practice-form/”
3. Select ‘Continents’ Drop down ( Use Id to identify the element )
4. Select option ‘Europe’ (Use selectByIndex)
5. Select option ‘Africa’ now (Use selectByVisibleText)
6. Print all the options for the selected drop down and select one option of your choice
7. Close the browser
 */
public class ZadatakDomaci2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
		
		//2.
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		//3.
		Select dropDown=new Select(driver.findElement(By.id("continents")));
		//4.
		dropDown.selectByIndex(1);
		//5/
		dropDown.selectByVisibleText("Africa");
		
		List<WebElement> elementCount=dropDown.getOptions();
		
		int iSize=elementCount.size();
		
		for(int i=0;i<iSize;i++)
		{
			String sValue=elementCount.get(i).getText();
			System.out.println(sValue);
			dropDown.selectByIndex(3);
		}
		
		
		driver.close();
	}

}
