package ru.job4j;

import org.junit.Test;
import ru.job4j.condition.Max;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.maxOfTwo(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMin1To2Then2() {
        int result2 = Max.maxOfTwo(2, 1);
        assertThat(result2, is(1));
    }

    @Test
    public void whenQually() {
        int result = Max.maxOfTwo(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMin1To2Then2Then3() {
        int result = Max.maxOfTwo(1, Max.maxOfTwo(2, 3));
        assertThat(result, is(3));
    }

    @Test
    public void whenMin1To2Then2Then3Then4() {
        int result = Max.maxOfTwo(1, Max.maxOfTwo(2, Max.maxOfTwo(3, 4)));
        assertThat(result, is(4));
    }
}
