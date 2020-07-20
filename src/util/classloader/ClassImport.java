package util.classloader;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassImport {

    public void invokeClassMethod(String directoryA, String methodName) {
        String directory = directoryA.replace( getFileName(directoryA), "");
        String classToLoad = getFileName(directoryA).replace(".class", "");
        File file = new File(directory);
        Class classLoaded;
        try {
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader classLoader = new URLClassLoader(urls);
            classLoaded = classLoader.loadClass(classToLoad);
            Constructor constructor = classLoaded.getConstructor();
            Object myClassObject = constructor.newInstance();
            Method method = classLoaded.getMethod(methodName);
            method.invoke(myClassObject);
        } catch (MalformedURLException e) {
            e.printStackTrace(); // ???
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // ???
        } catch (InstantiationException e) {
            e.printStackTrace(); // ???
        } catch (InvocationTargetException e) {
            e.printStackTrace(); // ???
        } catch (NoSuchMethodException e) {
            e.printStackTrace(); // ???
        } catch (IllegalAccessException e) {
            e.printStackTrace(); // ???
        }
    }

    private String getFileName(String charSequence) {
        String fileName = null;
        for( int i = charSequence.length() - 1; i > 0 ; i-- ) {
            if(charSequence.charAt(i) == '/' || charSequence.charAt(i) == '\\') {
                fileName = charSequence.substring( i + 1 );
                break;
            }
        }
        return fileName;
    }

}
