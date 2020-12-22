package IOstream.File_Class;

import java.io.File;
import java.io.FilenameFilter;

public class Case03 {

    public static void main(String[] args) {
        FilenameFilter filter = new FilenameFilter() {
            @Override
            //if return true, add the sub-directory into list; otherwise, return false
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                if(currFile.isFile() && name.endsWith(".txt")){
                    return true;
                }else{
                    return false;
                }
            }
        };
        File file = new File("src/test");
        if(file.exists()){
            String[] lists = file.list(filter);
            for(String name : lists){
                System.out.println(name);
            }
        }
    }
}
