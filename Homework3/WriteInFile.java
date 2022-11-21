package Homework3;
import java.io.File;
import java.io.FileWriter;
public class WriteInFile {
    public void writeInFile(String output) {

        File file = new File("C:\\Users\\Anna\\IdeaProjects\\java_exceptions\\Homework3\\text");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);

            try {

                fw.append(output + "\n");

            } finally {

                fw.flush();
                fw.close();

            }
        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }
}
