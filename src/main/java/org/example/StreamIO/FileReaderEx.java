package org.example.StreamIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader=null;
        try {
            reader = new FileReader("text.txt");
            int n;
           while ((n = reader.read()) != -1){
               System.out.print((char)n);
           }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            reader.close();
        }

    }
}
