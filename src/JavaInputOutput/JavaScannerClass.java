package JavaInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaScannerClass {
    public static void main(String[] args) {
        //using scanner class
        //slow because it scanner does the parsing of input data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:\n");
        String name = sc.nextLine();//take whole line as input
        String lastname = sc.next();//takes single word from the line as input
        System.out.println("Hey "+ name+" "+lastname+"\nHow are you?");

        //using buffered reader
        //throws IOException
        //reads data in sequential manner so its fast
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter college name");
        String line;
        try {
            line = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(line+" is decent college");
    }
}
