package exercise3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryTreeSaver {

    public static void saveDirectoryTreeToFile(String directoryPath, String outputFilePath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
                saveRecursive(directory, 0, writer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    private static void saveRecursive(File directory, int level, BufferedWriter writer) throws IOException {
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.sort(files);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            for (File file : files) {
                String type = file.isDirectory() ? "D" : "F";
                String lastModified = sdf.format(file.lastModified());
                writer.write("  ".repeat(level) + file.getName() + " [" + type + "] " + lastModified);
                writer.newLine();
                if (file.isDirectory()) {
                    saveRecursive(file, level + 1, writer);
                }
            }
        }
    }
}