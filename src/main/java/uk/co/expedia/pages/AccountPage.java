package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[@id='header-account-signin-button']")
    WebElement _signInLink;

    @FindBy(xpath = "//div[@id='header-exclusive-deals']")
    WebElement _siginPricingText;

    public void clickOnSignInLink() {
        Reporter.addStepLog(" Clicking on Signin link" + _signInLink.toString());
        clickOnElement(_signInLink);
        log.info(" Clicking on Signin link" + _signInLink.toString());
    }

    public String getSiginPricingText(){
        Reporter.addStepLog("verify signin pricing text"+ _siginPricingText.toString());
        log.info("verify signin pricing text"+ _siginPricingText.toString());
        return getTextFromElement(_siginPricingText);
    }

}
