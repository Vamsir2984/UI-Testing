package pages;
import org.openqa.selenium.By;


import static org.junit.Assert.assertEquals;
import static utility.BrowserDriver.driver;

public class RegistrationPage {
    public static String User_registration_page="/html/body/center/h1";
public static void visibility_Registration_page(){
    String actualproductcategory_fs = driver.findElement(By.xpath(User_registration_page)).getText();
    assertEquals("User Registration Page",actualproductcategory_fs);

}
}
