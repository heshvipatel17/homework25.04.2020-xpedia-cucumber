package uk.co.expedia.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.expedia.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[@id='header-account-menu']")
    WebElement _accountLink;

    @FindBy(xpath = "//a[@id='primary-header-flight']")
    WebElement _flightsTab;

    public void clickOnAccountLink() {
        Reporter.addStepLog("Clicking on Account link" + _accountLink.toString());
        clickOnElement(_accountLink);
        log.info("Clicking on Account link" + _accountLink.toString());
    }

    public void clickOnFlightsTab() {
        Reporter.addStepLog("Clicking on flights tab : " + _flightsTab.toString());
        clickOnElement(_flightsTab);
        log.info("Clicking on flights tab : " + _flightsTab.toString());
    }

}
