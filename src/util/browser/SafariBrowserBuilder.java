package util.browser;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafariBrowserBuilder extends BrowserBuilder {

    @Override
    public void configureName() {
        browser.setName("safari");
    }

    @Override
    public void configureDriverPath(String driverPath) {
        browser.setDriverPath(driverPath);
    }

    @Override
    public void configureWebDriver() {
        SafariDriver safariDriver = new SafariDriver( browser.getBrowserOptions() );
        browser.setWebDriver(safariDriver);
    }

    @Override
    public void configureWebDriverWait() {
        WebDriverWait webDriverWait = new WebDriverWait( browser.getWebDriver(), browser.WAIT_TIME_IN_SECONDS );
        browser.setWebDriverWait(webDriverWait);
    }

    @Override
    public void configureBrowserOption(String driverOption) {
        SafariOptions safariOptions = new SafariOptions();
        safariOptions.setUseTechnologyPreview(true);
    }

}
