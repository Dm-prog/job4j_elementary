package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class DepartumentsTest {

    @Test
    public void fillGaps() {
        List<String> input = Arrays.asList( "k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1/sk1", "k1");
        assertEquals(input, Departments.fillGaps(expect));
    }
}
