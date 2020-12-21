package IOstream;


import java.io.*;

//Convert the Byte stream to character stream
public class Case04 {

    public static void main(String[] args) throws IOException {
        FileInputStream input =  new FileInputStream("src.txt");
        InputStreamReader inStrReader = new InputStreamReader(input);//将字节输入流转换成字符输入流
        BufferedReader buffR = new BufferedReader(inStrReader);//用BufferedRead 封装， 形成缓冲输入流


        OutputStream output = new FileOutputStream("des.txt");//将字节输出流转换成字符输出流
        OutputStreamWriter outStrWriter = new OutputStreamWriter(output);
        BufferedWriter buffW = new BufferedWriter(outStrWriter);//用BufferedRead 封装， 形成缓冲输出流

        String line = null;
        while((line= buffR.readLine()) != null){
            buffW.write(line);
            buffW.newLine();
        }
        buffR.close();
        buffW.close();
    }
}
