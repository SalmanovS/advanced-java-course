package org.example.StreamIO.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String> employee = new ArrayList<>();
        employee.add("Oleg");
        employee.add("Maria");
        employee.add("Alexander");

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"))){
            outputStream.writeObject(employee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
