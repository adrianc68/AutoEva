package util.browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeBrowserBuilder extends BrowserBuilder {

    public ChromeBrowserBuilder() {
        super.browser = new Browser();
    }

    @Override
    public void configureName() {
        browser.setName("chrome");
    }

    @Override
    public void configureDriverPath(String driverPath) {
        browser.setDriverPath(driverPath);
    }

    @Override
    public void configureWebDriver() {
        ChromeDriver chromeDriver = new ChromeDriver( browser.getBrowserOptions() );
        browser.setWebDriver(chromeDriver);
    }

    @Override
    public void configureWebDriverWait() {
        WebDriverWait webDriverWait = new WebDriverWait( browser.getWebDriver(), browser.WAIT_TIME_IN_SECONDS);
        browser.setWebDriverWait(webDriverWait);
    }

    @Override
    public void configureBrowserOption(String driverOption) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(driverOption);
    }

}
