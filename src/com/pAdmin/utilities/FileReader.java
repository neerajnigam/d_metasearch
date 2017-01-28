package com.pAdmin.utilities;

import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

/**
 * Created by neeraj on 13-Dec-16.
 * class read any file usually used for reading configuration from config file,
 * initiated and used in sites handler class.
 */
public class FileReader {

    static String content = null;

    public static String ReadFile(String path){
        try {
            content = new Scanner(new File(path)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return content;
    }
}
