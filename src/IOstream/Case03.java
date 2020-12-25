package IOstream;

import java.io.*;

public class Case03 {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/src.txt"); //读文件=字符流
        BufferedReader buffR = new BufferedReader(reader);//用BufferedRead 封装reader, 形成缓冲区， 提供读效率

        FileWriter writer = new FileWriter("src/des.txt");
        BufferedWriter buffW = new BufferedWriter(writer);

        String line = null;
        while((line=buffR.readLine()) != null){ //每次读一行数据
            buffW.write(line);
            buffW.newLine();
        }
        buffR.close();
        buffW.close();
    }
}
