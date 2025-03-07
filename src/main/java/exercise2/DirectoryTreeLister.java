package exercise2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryTreeLister {

    public static void listDirectoryTree(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            listRecursive(directory, 0);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    private static void listRecursive(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (File file : files) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = sdf.format(file.lastModified());
                System.out.println("  ".repeat(level) + file.getName() + " [" + type + "] " + lastModified);
                if (file.isDirectory()) {
                    listRecursive(file, level + 1);
                }
            }
        }
    }
}