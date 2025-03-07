package exercise5;

public class Main {
    public static void main(String[] args) {
        String exampleObject = "Hello, this is a serialized object!";
        String filePath = "object.ser";

        ObjectSerializer.serializeObject(exampleObject, filePath);

        Object deserializedObject = ObjectSerializer.deserializeObject(filePath);
        System.out.println("Deserialized Object: " + deserializedObject);
    }
}
