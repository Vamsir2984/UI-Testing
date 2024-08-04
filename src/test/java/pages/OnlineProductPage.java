package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductPage extends BrowserDriver {
    public static String formalshoes_dropdown_class = "formalshoedropdown";

    public static String formalshoes_webtable = "/html/body/div[2]/table";

    public static String formalshoes_webtable_tr = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalshoesdropdpown()  {
        driver.findElement(By.className(formalshoes_dropdown_class)).click();
    }

    public static String getText_formalshoes_firstvalue() {
        String formalshoesText =  driver.findElement(By.xpath(formalshoes_webtable_tr)).getText();
        return formalshoesText;
    }


}