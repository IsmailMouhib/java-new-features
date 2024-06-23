package ma.java11.readWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWrite {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/ma/java11/readWrite/pays.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        System.out.println("---------");

        Path path2 = Paths.get("src/ma/java11/readWrite/pays_new.txt");
        String newFileContent = fileContent.replace("france", "portugal");
        Files.writeString(Paths.get("src/ma/java11/readWrite/pays_new.txt"), newFileContent);
        String fileNewContent = Files.readString(path2);
        System.out.println(fileNewContent);

    }
}
