package com.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionSample {

    public void unchecked() {
        String name = null;
        name.equals("JAVA");
    }

    public void checked() {
        try {
            File file = new File("파일경로");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
