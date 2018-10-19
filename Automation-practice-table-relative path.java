package Testiranje;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
/*
 * 1. Launch new Browser
2. Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
3. Get the text from cell ‘Dubai’ with using relative path and print it on the console
4. Click on the link ‘Detail’ of the first row and last column and print "Successfully clicked" message
5. Close the browser
 */
public class ZadatakDomaci1 {

	public static void main(String[] args) {
		//1.
				WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Chromdriver\\chromedriver.exe");
				
				//2.
				driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
				
				//3.
				
				WebElement zaStampu=driver.findElement(By.xpath("//td[contains(text(),'Dubai')]"));
				System.out.println(zaStampu.getText());
				//vezba
				//String zaStampu3=driver.findElement(By.xpath("//td[contains(text(),'Dubai')]")).toString();				
				//System.out.println(zaStampu3);
				//4.	
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]")).click();
				System.out.println("Successfully clicked");
				//5.
				driver.close();
	}

}
