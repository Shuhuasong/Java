package IOstream;

import java.io.*;

public class IOStreamTest {
    public static void main(String[] args) throws IOException {
        //test1();
        test2();
       // test3();
    }

    public static void test1() throws IOException {
            InputStream input = new FileInputStream("src/inputFile.txt");
            OutputStream output = new FileOutputStream("src/outputFile.txt");

            int content;
            long startTime = System.currentTimeMillis();
            while((content=input.read()) != -1){
                output.write(content);
            }
            long endTime = System.currentTimeMillis();
            System.out.println("The time for copy the file: " + (endTime-endTime));
            input.close();
            output.close();
    }

    public static void test2() throws IOException {
        File file;
        InputStream input = new FileInputStream("src/inputFile.txt");
        OutputStream output = new FileOutputStream("src/outputFile.txt");
        byte[] buff = new byte[1024];
        int len;
        long startTime = System.currentTimeMillis();
        while((len = input.read(buff)) != -1){
            output.write(buff, 0, len);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("The time for copy the file: " + (endTime-endTime));
        input.close();
        output.close();
    }

    public static void test3() throws IOException {
        File file;
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/inputFile.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/outputFile.txt"));
        byte[] buff = new byte[1024];
        int content;
        long startTime = System.currentTimeMillis();
        while((content=bis.read()) != -1){
            bos.write(content);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("The time for copy the file: " + (endTime-endTime));
        bis.close();
        bos.close();
    }
}
