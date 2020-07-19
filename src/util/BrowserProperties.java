package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BrowserProperties {
    private static final String PROPERTIES_PATH = "driver/configuration.properties";

    public boolean writeProperties() {
        boolean result = false;
        Properties properties = readProperties();
        try ( OutputStream output = new FileOutputStream(PROPERTIES_PATH) ) {
            properties.clear();
            properties.put("application.opened.by.first.time", "true" );
            properties.put("browser.selected.option.headless", "false" );
            properties.put("browser.selected.name", "chrome" );
            properties.put("browser.selected.wait.time", "10" );
            properties.store(output, null);
            result = true;
        } catch (IOException io) {
            Logger.getLogger( BrowserProperties.class.getName() ).log(Level.SEVERE, null, io);
        }
        return result;
    }

    public static int readWaitTimeProperty() {
        Properties properties = readProperties();
        return Integer.parseInt( properties.getProperty("browser.selected.wait.time") );
    }

    private static Properties readProperties() {
        Properties properties = new Properties();
        try ( InputStream input = new FileInputStream(PROPERTIES_PATH) ) {
            properties.load(input);
        } catch (IOException io) {
            Logger.getLogger( BrowserProperties.class.getName() ).log(Level.SEVERE, null, io);
        }
        return properties;
    }

}
