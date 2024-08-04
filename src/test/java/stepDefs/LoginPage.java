package stepDefs;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the log in details")
    public void User_successfully_enters_the_log_in_details()  {
       sendkeys_username();
//        //from pages we define this...
       sendkeys_password();
//        //from pages we define this
      click_login_btn();

    }

    @When("User clicks on new Registration button")
    public void User_clicks_on_new_Registration_button() {

        click_NewRegister_btn();
    }

}
