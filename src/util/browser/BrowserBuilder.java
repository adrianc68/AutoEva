package util.browser;

public abstract class BrowserBuilder {
    Browser browser;

    public Browser getBrowser() {
        return browser;
    }

    public abstract void configureName();
    public abstract void configureDriverPath(String driverPath);
    public abstract void configureWebDriver();
    public abstract void configureWebDriverWait();
    public abstract void configureBrowserOption(String driverOption);

}
