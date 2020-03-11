package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int in = 5;
        int expected = 120;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int out = Factorial.calc(in);
        Assert.assertEquals(expected, out);
    }
}
