package com.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class ExceptionSample {

    public void unchecked() {
        String name = null;
        name.equals("JAVA");
    }

    public void checked() {
        File file = new File("파일경로");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String recovery() {
        try {
            //do something...
        } catch (CustomException e) {
            return recovery();
        }
        return null;
    }

    public void throwException() throws ArrayIndexOutOfBoundsException {
        List<String> list = Arrays.asList("1", "2");
        list.get(3);
    }

    public void wrapException() {
        try {
            //do something...
        } catch (NullPointerException e) {
            throw new CustomException(e);
        } catch (IllegalArgumentException e) {
            throw new CustomException(e);
        }
    }

}
