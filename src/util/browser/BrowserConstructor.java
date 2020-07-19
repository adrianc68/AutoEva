package util.browser;

public class BrowserConstructor {
    BrowserBuilder browserBuilder;

    public void setBrowserBuilder(BrowserBuilder browserBuilder) {
        this.browserBuilder = browserBuilder;
    }

    public Browser getBrowser() {
        return browserBuilder.getBrowser();
    }

    public void createBrowserInstance(String driverPath, String browserOption) {
        browserBuilder.configureName();
        browserBuilder.configureDriverPath(driverPath);
        browserBuilder.configureBrowserOption(browserOption);
        browserBuilder.configureWebDriver();
        browserBuilder.configureWebDriverWait();
    }

}
