package basic.problems.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\mssma\\IdeaProjects\\JavaPractice\\src\\basic\\problems\\filehandling\\newFile.txt";
        //File file = new File(filePath);
        try ( FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write("Hiii i am Manoj" +
                    "\nPracticing Core Java For interviews" +
                    "\nLearning frameworks like spring,SpringBoot");
            fileWriter.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
