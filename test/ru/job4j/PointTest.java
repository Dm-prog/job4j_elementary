package ru.job4j;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance() {
        Point point = new Point(4, 2);
        double expected = 2.0;
        double out = point.distance(new Point(2, 2));
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void distance3d() {
        Point point = new Point(2, 4, 2);
        double expected = 2.0;
        double out = point.distance3d(new Point(2, 2, 2));
        Assert.assertEquals(expected, out, 0.1);
    }
}
