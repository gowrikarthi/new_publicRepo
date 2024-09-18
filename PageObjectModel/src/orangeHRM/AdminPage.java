package orangeHRM;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class AdminPage {
	WebDriver driver;
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By Admin=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a");
	public void Admin_click()
	{
		WebElement Adminclick=driver.findElement(Admin);
	new Actions(driver)
	.moveToElement(Adminclick).click() .perform();
	}
	
	
	By systemuser=By.className("oxd-text oxd-text--h5 oxd-table-filter-title");
	public void systemusername(String systemuser1)
	{
		WebElement userclick1=driver.findElement(systemuser);
		new Actions(driver)
		.moveToElement(userclick1).click() .perform();
		}
	By add_user=By.className("oxd-button oxd-button--medium oxd-button--secondary");
	public void add_Systemuser()
{
		driver.findElement(add_user).click();
		}
}
//	By scrolluser=By.className("oxd-select-text oxd-select-text--active");
//public void scroll()
//{
//WebElement scrolluser1=driver.findElement(scrolluser);
//new Actions(driver)
//.moveToElement(scrolluser1)
//		.click()
//perform();
//
//	} 
//	By   dropdown=By.className("oxd-icon bi-caret-down-fill oxd-select-text--arrow");
//		//className ("oxd-icon bi-caret-down-fill oxd-select-text--arrow");
//	
//	public void userRole()
//	
//	{
//		driver.findElement(dropdown).click();
//	}
//	By Admindrop=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
//	
//	public void admindropdown()
//	{
//		
//		
//		Select  drop=new Select((WebElement) Admindrop);
//		drop.selectByIndex(0);
//	}
//	By essdrop=By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
//		public void ESSdropdown()
//		{
//			Select drop=new Select( (WebElement) essdrop);
//		drop.selectByIndex(1);
//		
//	}
//	
//		
//}
