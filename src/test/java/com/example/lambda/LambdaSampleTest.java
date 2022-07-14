package com.example.lambda;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LambdaSampleTest {

    @Test
    public void noLambdaTest() {
        CalculatorImpl cal = new CalculatorImpl();
        assertThat(cal.add(3, 5)).isEqualTo(8);
    }

    @Test
    public void lambdaTest() {
        Calculator cal = (int a, int b) -> a + b;
        assertThat(cal.add(5, 3)).isEqualTo(8);
    }

    @Test
    public void lambdaTestV2() {
        Calculator cal = (a, b) -> a + b;
        assertThat(cal.add(5, 3)).isEqualTo(8);
    }

}
