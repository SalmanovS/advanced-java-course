package org.example.StreamIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String text = "Текст (от лат. textus «ткань; сплетение, связь, сочетание») — зафиксированная \n"+
                "на каком-либо материальном носителе человеческая мысль; в общем плане связная и полная \n" +
                "последовательность символов \n";
        String number = "123456789";
        FileWriter writer = null;
        try {
             writer = new FileWriter("text.txt",true);
             writer.write(text);
             writer.write(number);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            writer.close();
        }
    }
}
