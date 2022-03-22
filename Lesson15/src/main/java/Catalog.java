import java.io.File;
import java.util.Objects;

public class Catalog {
    public static void main(String[] args) {
        readFiles(new File("D:\\ForS"));
    }

    public static void readFiles(File directory) {
        if (directory.isDirectory()) {
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.isFile()) {
                    System.out.println(file.getName() + " file");
                } else {
                    System.out.println(file.getName() + " catalog");
                    readFiles(file);
                }
            }
        }
    }
}
