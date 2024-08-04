package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcateogry_formalshoes = "//*[text()='Formal Shoes']";

    public static String productcateogry_sportsshoes = "//*[text()='Sports']";

    public static String productcateogry_sneakers = "//*[text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() {
        String actualproductcategory_fs = driver.findElement(By.xpath(productcateogry_formalshoes)).getText();
        assertEquals("Formal Shoes",actualproductcategory_fs);
    }

    public static void visibility_productcategory_sportsshoes() {
        String actualproductcategory_ss = driver.findElement(By.xpath(productcateogry_sportsshoes)).getText();
        assertEquals("Sports",actualproductcategory_ss);
    }

    public static void visibility_productcategory_sneakershoes()  {
        String actualproductcategory_s = driver.findElement(By.xpath(productcateogry_sneakers)).getText();
        assertEquals("Sneakers",actualproductcategory_s);
    }

}