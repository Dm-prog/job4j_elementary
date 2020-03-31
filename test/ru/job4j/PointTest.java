package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        int x1In = 0;
        int y1In = 0;
        int x2In = 2;
        int y2In = 0;
        double expected = 2.0;
        double out = Point.distance(new Point(2, 2));
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void distance() {
        double expected = 2.0;
        double out = distance(new Point(2, 2, 3));
        Assert.assertEquals(expected, out, 0.1);
    }
}
