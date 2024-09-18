package orangeHRM;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class LoginPagef
{
WebDriver driver;
public  LoginPagef(WebDriver driver)//constructor
{
        this.driver = driver;
        }

By uName = By.name("username");


By pswd = By.name("password");


By loginBtn = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");


//Method to enter username
public void username(String user)
{
////*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]""/form/div[3]/button

driver.findElement(uName).sendKeys(user);
}
//Method to enter password
public void enterPassword(String pass) {
driver.findElement(pswd).sendKeys(pass);
}
public void clickLogin() {

//By loginBtn;
WebElement login_click = driver.findElement(loginBtn);
        new Actions(driver)
                .moveToElement(login_click)
                .click()
                .perform();

}
}