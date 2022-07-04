package stepDefinitions;

import io.cucumber.java.en.Given;
import pojo.User;

public class BaseSteps {

    private User user;

    public BaseSteps(User user) {
        this.user = user;
    }

    @Given("Go to home page")
    public void goToHomePage() {
        user.setUsername("Valodik");
        System.out.println("go home page");
    }
}
