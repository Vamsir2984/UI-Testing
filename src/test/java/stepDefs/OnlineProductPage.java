package stepDefs;




import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductPage.click_formalshoesdropdpown;
import static pages.OnlineProductPage.getText_formalshoes_firstvalue;
import static pages.RegistrationPage.visibility_Registration_page;

public class OnlineProductPage {

    @When("User clicks on Formal Shoes drop down")
    public void user_clicks_on_Formal_Shoes_drop_down()  {
       click_formalshoesdropdpown();
    }
    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_Products()  {
        getText_formalshoes_firstvalue();
       assertEquals("   Classic Cheltenham",getText_formalshoes_firstvalue());
    }

}