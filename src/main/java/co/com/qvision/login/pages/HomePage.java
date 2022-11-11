package co.com.qvision.login.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://demo.guru99.com/insurance/v1/index.php")

public class HomePage extends PageObject {

    @FindBy(id = "email")
    WebElement textBoxEmail;

    @FindBy(id = "password")
    WebElement textBoxPassword;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[3]/input")
    WebElement btnLogin;

    public void textBoxEmailLogin(String email){

        textBoxEmail.sendKeys(email);
    }
    public void textBoxPasswordLogin(String password){

        textBoxPassword.sendKeys(password);
    }
    public void clickButton(){

        btnLogin.click();
    }
}
