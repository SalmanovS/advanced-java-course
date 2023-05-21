package org.example.StreamIO;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("newtext.txt"))) {
           String line;
           while((line = reader.readLine()) != null){
               writer.write(line);
               writer.write("\n");
           }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
