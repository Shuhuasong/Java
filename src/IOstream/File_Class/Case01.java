package IOstream.File_Class;

import java.io.File;

public class Case01 {

    public static void main(String[] args) {
        File file = new File("src/example.txt");// absolute path
        System.out.println("File name is:   " + file.getName());
        System.out.println("File's reletive name:   " + file.getPath());
        System.out.println("File's absolute name:   " + file.getAbsolutePath());
        System.out.println("File's parent path:   " + file.getParent());
        System.out.println(file.canRead() ? "Readable File" : "unReadable File");
        System.out.println(file.canWrite() ? "Writable File" : "unWritable File");
        System.out.println(file.isFile() ? "is a File" : "is not a File" );
        System.out.println(file.isDirectory() ? "is absolute path :" : "is not a absolute path");
        System.out.println("last modified time: " + file.lastModified());
        System.out.println("File's size is: " + file.length() + "bytes");
        System.out.println("if the file is deleted successfully: " + file.delete());
    }
}
