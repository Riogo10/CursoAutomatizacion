package co.com.qvision.login.steps;

import co.com.qvision.login.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class GoogleHomePage {

    HomePage homePage;

    @Step
    public void opensGoogleTranslatePage(){
        homePage.open();
    }
}