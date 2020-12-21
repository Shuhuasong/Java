package IOstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Case02 {

    public static void main(String[] args) throws IOException {

        File file;
        FileWriter writer = new FileWriter("src/writer.txt");
        String str = "Hello, everyone";
        writer.write(str); //批量写入多个字符， 直接将字符串写入
        writer.write("\r\r"); //转义字符
        writer.close();
    }
}
