package IOstream.File_Class;

import java.io.File;

public class Case02 {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        File file = new File("src/IOstream");
        if(file.isDirectory()){
            String[] names = file.list();//collect all the name of files and sub-directory
            for(String name : names){
               // System.out.println(name);
            }
        }
    }

    public static void test2(){
        File file = new File("src.test");
        filterDir(file);
    }

    private static void filterDir(File dir){
        File[] files = dir.listFiles();

        for(File file : files){
            if(file.isDirectory()){
                filterDir(file);
            }
            System.out.println(file.getAbsolutePath());
            file.delete();
        }
    }
}
/*
The list() method returns the names of all files in the given directory in the form of a String array.

The ListFiles() method returns the objects (File) of the files in the given directory, in the form of an array of type File.
 */