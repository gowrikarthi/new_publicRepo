package OrangeHRM_RunPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import orangeHRM.AdminPage;
import orangeHRM.LoginPagef;

import org.openqa.selenium.WebElement;
public class LoginPageExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		LoginPagef login=new LoginPagef(driver);
		login.username("Admin");
	login.enterPassword("admin123");
	login.clickLogin();
	
	AdminPage admin=new AdminPage(driver);
	admin.Admin_click();
	
//	admin.systemusername("john");
	
//	admin.userRole();
//	admin.admindropdown();
//	admin.ESSdropdown();
}
}
