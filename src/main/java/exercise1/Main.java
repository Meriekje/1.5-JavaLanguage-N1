package exercise1;

import static exercise1.DirectoryLister.listDirectoryContents;

public class Main {

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\merit\\git\\1.5-JavaLanguage-N1\\src\\main\\resources";
        listDirectoryContents(directoryPath);
    }
}
