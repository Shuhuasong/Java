package BookStoreSellingSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FileUtil {

    //save all the books' information in the cart into a file
    public static final String SEPERATE_LINE = "\r\n";

    public static void saveLog(List<SaleBook> saleBooks) {
         if(saleBooks==null || saleBooks.size()==0){
             return;
         }

         FileWriter fileWriter = null;
         try{
             fileWriter = getWriter();
             for(SaleBook salebook : saleBooks){
                 fileWriter.write(salebook.toString());
                 fileWriter.write(SEPERATE_LINE);
             }
         } catch (IOException e) {
             e.printStackTrace();
         } finally{

         }
    }

    public static FileWriter getWriter() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String fileName = "Selling Record " + dateFormat.format(new Date()) + ".csv";
        File file = new File(fileName);
        FileWriter filewriter = null;
        if(file.exists()){
            filewriter = new FileWriter(file, true);
        }else{
            filewriter = new FileWriter(file);
        }
        return filewriter;
    }
}
