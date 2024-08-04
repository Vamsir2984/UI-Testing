package stepDefs;
import io.cucumber.java.en.Given;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signIn_link;
import static pages.HomePage.click_OnlineProducts_link;

public class HomePage {

    @Given("User navigates to the Login page")
    public void User_navigates_to_the_Login_page() throws InterruptedException {

            click_hamburger_menu();
           click_signIn_link();

    }

    @Given("User navigates to the Online products page")
    public void User_navigates_to_the_Online_products_page() throws InterruptedException  {

         click_hamburger_menu();
         click_OnlineProducts_link();

    }
}
