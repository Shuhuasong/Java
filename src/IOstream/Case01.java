package IOstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Case01 {

    public static void main(String[] args) throws IOException {
        File file;
        FileReader reader = new FileReader("src/test.txt");
        int ch = 0;    // integer = 4 byte , char= 2 byte （一次读一个字符）
        while((ch=reader.read()) != -1){
            System.out.println((char)ch);
        }
        reader.close();
    }
}
