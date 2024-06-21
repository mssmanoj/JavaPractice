package basic.problems.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;

public class FileReaderTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();

        String filePath = "C:\\Users\\mssma\\IdeaProjects\\JavaPractice\\src\\basic\\problems\\filehandling\\newFile.txt";
        File file = new File(filePath);
        File file2 = new File("newFil.txt");  //unavailableFile to test exception
        try(FileReader fileReader = new FileReader(file)){
            int read = 0;
           do {
               read = fileReader.read();
               System.out.print((char)read);
           }while(read != -1);
        } catch (IOException e) {
            //System.out.println("FileNotFound:"+e);
            throw new RuntimeException(e);
        }
    }
}
