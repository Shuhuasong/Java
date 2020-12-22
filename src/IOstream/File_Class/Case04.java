package IOstream.File_Class;

import java.io.File;

public class Case04 {

    public static void main(String[] args) {
        test1();
    }

    //delete a regular file
    public static void test1(){
        File file = new File("src/text/test1.txt");
        if(file.exists()){
            System.out.println(file.delete());
        }
    }

    //delete the whole directory and the sub-directory + file
    public static void test2(){
        File file = new File("src/test");
        deleteDir(file);
    }

    private static void deleteDir(File dir){
        if(dir.exists()){
            File[] files = dir.listFiles();
            for(File file : files){
                if(file.isDirectory()){
                    deleteDir(file);
                }else{
                    file.delete();
                }
            }
            dir.delete();
        }
    }
}
