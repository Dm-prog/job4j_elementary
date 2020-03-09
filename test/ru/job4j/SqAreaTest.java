package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;


public class SqAreaTest {
    @Test
    public void square() {
        int in1 = 6;
        int in2 = 2;
        double expected = 2.0;
        double out = SqArea.square(in1, in2);
        Assert.assertEquals(expected, out, 0.1);
    }
}
