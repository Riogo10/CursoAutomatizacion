package co.com.qvision.login.steps;


import co.com.qvision.login.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GoogleHomePage {

    HomePage homePage;

    @Step
    public void openPage(){
        homePage.open();
    }

    @Step
    public void textBoxEmailLogin(String email){
        homePage.textBoxEmailLogin(email);
    }

   @Step
    public void textBoxPasswordLogin( String password){
       homePage.textBoxPasswordLogin(password);
    }
    @Step
    public void validationFinalMessage(String finalMessage){
        Assert.assertEquals(homePage.finalMessage(), finalMessage);
    }
}