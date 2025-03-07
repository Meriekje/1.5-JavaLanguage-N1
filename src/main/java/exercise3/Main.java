package exercise3;

public class Main {

    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\merit\\git\\1.5-JavaLanguage-N1\\src\\main\\resources";
        String outputFilePath = "readme.txt";
        DirectoryTreeSaver.saveDirectoryTreeToFile(directoryPath, outputFilePath);
    }
}