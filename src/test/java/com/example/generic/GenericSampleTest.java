package com.example.generic;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.assertj.core.api.Assertions.*;

public class GenericSampleTest {

    @Test
    public void genericTest() {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Print<String> ps = new Print<>();
        ps.setText("123");
        ps.printText();

        assertThat(out.toString()).isEqualTo("123");
    }
}
