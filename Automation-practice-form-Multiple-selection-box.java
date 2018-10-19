package Testiranje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
/*
 * 1. Launch new Browser
2. Open “http://toolsqa.wpengine.com/automation-practice-form/”
3. Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
4. Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
5. Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
6. Print and select all the options for the selected Multiple selection list.
7. Deselect all options
8. Close the browser

uz pomoc:
http://toolsqa.com/selenium-webdriver/dropdown-multiple-select-operations/
 */
public class ZadatkDomaci3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
		
		//2.
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		//3.
		WebElement element= driver.findElement(By.name("selenium_commands"));
		Select oSelect=new Select(element);
		//4.
		oSelect.selectByIndex(0);
		oSelect.deselectByIndex(0);
						
		//System.out.println("Uspelo");
		
		//5.
		oSelect.selectByVisibleText("Navigation Commands");
		oSelect.deselectByVisibleText("Navigation Commands");
		
		//6.
		List<WebElement> elementCount=oSelect.getOptions();
		
		int iSize=elementCount.size();
		
		for(int i=0;i<iSize;i++)
		{
			String sValue=elementCount.get(i).getText();
			System.out.println(sValue);
		}
		//7.
		oSelect.deselectAll();
		driver.close();

	}

}
