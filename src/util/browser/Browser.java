package util.browser;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.BrowserProperties;

public class Browser {
    protected final int WAIT_TIME_IN_SECONDS;
    private String name;
    private String driverPath;
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;
    private MutableCapabilities browserOptions;

    public Browser() {
        WAIT_TIME_IN_SECONDS = BrowserProperties.readWaitTimeProperty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverPath() {
        return driverPath;
    }

    public void setDriverPath(String driverPath) {
        this.driverPath = driverPath;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    public void setWebDriverWait(WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
    }

    public MutableCapabilities getBrowserOptions() {
        return browserOptions;
    }

    public void setBrowserOptions(MutableCapabilities browserOptions) {
        this.browserOptions = browserOptions;
    }

}
