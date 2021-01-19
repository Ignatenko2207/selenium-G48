package ua.mainacademy.helper;

import java.io.File;

public class PathHelper {

    public String getChropmeDriverPath(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("chromedriver.exe").getFile());
        return file.getAbsolutePath();
    }
}
