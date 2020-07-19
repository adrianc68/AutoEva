package util.browser;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirefoxBrowserBuilder extends BrowserBuilder {

    @Override
    public void configureName() {
        browser.setName("gecko");
    }

    @Override
    public void configureDriverPath(String driverPath) {
        browser.setDriverPath(driverPath);
    }

    @Override
    public void configureWebDriver() {
        FirefoxDriver firefoxDriver = new FirefoxDriver( browser.getBrowserOptions() );
        browser.setWebDriver(firefoxDriver);
    }

    @Override
    public void configureWebDriverWait() {
        WebDriverWait webDriverWait = new WebDriverWait( browser.getWebDriver(), browser.WAIT_TIME_IN_SECONDS);
        browser.setWebDriverWait(webDriverWait);
    }

    @Override
    public void configureBrowserOption(String driverOption) {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments(driverOption);
    }

}
