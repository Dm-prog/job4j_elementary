package ru.job4j.pseudo;

import org.junit.Test;
import ru.job4j.stragery.Square;
import ru.job4j.stragery.Triangle;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    @Test
    public void whenDrawSquare() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("  +  ")
                                .add(" + + ")
                                .add("+++++")
                                .toString()
                )
        );
    }
}
