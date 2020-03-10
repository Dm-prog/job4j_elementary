package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMin1To2Then2() {
        int result2 = Max.max(2, 1);
        assertThat(result2, is(1));
    }

    @Test
    public void whenQually() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }
}
