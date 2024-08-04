package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class HomePage extends BrowserDriver{

    public static String hamburger_menu_xpath="//*[@id='menuToggle']/input";
    public static String SingIn_link_text="/html/body/div/nav/div/ul/a[2]/li";
    public static String Online_Products_page="//*[@id='menu']/a[3]";



    public static void click_hamburger_menu() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SingIn_link_text)));
        signInLink.click();
    }

    public static void click_OnlineProducts_link()  throws InterruptedException {

       //Thread.sleep(2000);
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement clickLink=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Online_Products_page )));
        //driver.findElement(By.xpath(Online_Products_page )).click();
        clickLink.click();
    }

}
