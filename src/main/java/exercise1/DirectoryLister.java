package exercise1;

import java.io.File;
import java.util.Arrays;

public class DirectoryLister {

    public static void listDirectoryContents(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            String[] files = directory.list();
            Arrays.sort(files);
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }

}