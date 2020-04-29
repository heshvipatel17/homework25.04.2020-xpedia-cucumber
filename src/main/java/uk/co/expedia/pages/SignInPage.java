package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//input[@id='gss-signin-email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='gss-signin-password']")
    WebElement _passwordField;

    @FindBy(xpath = "//button[@id='gss-signin-submit']")
    WebElement _signInTab;

    @FindBy(xpath = "//p[@id='signInEmailErrorMessage']")
    WebElement _errorMessage;

    public void enterEmailField(String emailId) {
        waitUntilElementToBeClickable(_emailField, 10);
        Reporter.addStepLog(" Entering email " + emailId + " to email field " + _emailField.toString());
        sendTextToElement(_emailField, emailId);
        log.info(" Enter email " + emailId + " to email field " + _emailField.toString());
    }

    public void enterPasswordField(String passwordD) {
        Reporter.addStepLog("Entering password  " + passwordD + " to password field " + _passwordField.toString());
        sendTextToElement(_passwordField, passwordD);
        log.info("Enter password  " + passwordD + " to password field " + _passwordField.toString());
    }

    public void clickOnSignInTab() {
        Reporter.addStepLog(" Clicking on sign in tab" + _signInTab.toString());
        clickOnElement(_signInTab);
        log.info(" Clicking on sign in tab" + _signInTab.toString());
    }

    public String assertErrorMessage() {
        Reporter.addStepLog(" verify message  from signin page" + _errorMessage.toString());
        log.info(" verify message from signin page" + _errorMessage.toString());
        return getTextFromElement(_errorMessage);
    }
    public void loginToApplication(String username, String password){
        enterEmailField(username);
        enterPasswordField(password);
        clickOnSignInTab();

    }
}
