package util;

import java.io.IOException;

public class SystemControl {

    public static boolean killProcess(String nameProcess) {
        boolean isProcessKilled = false;
        String osName = SystemInformation.getOSName();
        String command = getSystemCommand(osName, nameProcess);
        try {
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();
            if( process.exitValue()== 0 ){
                isProcessKilled = true;
            }
        } catch (IOException e) {
            e.printStackTrace(); // ????
        } catch (InterruptedException ex) {
            ex.printStackTrace(); // ????
        } catch (NullPointerException np) {
            np.printStackTrace(); // ????
        }
        return isProcessKilled;
    }

    private static String getSystemCommand(String osName, String nameProcess) {
        String command = null;
        if( osName.toUpperCase().contains("WIN") ){
            command = "taskkill /f /t /im " + nameProcess;
        }else if( osName.toUpperCase().contains("MAC") ){
            command ="killall " + nameProcess;
        }
        return command;
    }

}
