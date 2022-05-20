package com.example.exception;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.assertj.core.api.Assertions.*;

public class ExceptionSampleTest {


    @Test
    public void testUnchecked() {
        String name = null;
        assertThatExceptionOfType(NullPointerException.class).isThrownBy(() ->
                name.equals("JAVA")
        );
    }


}
