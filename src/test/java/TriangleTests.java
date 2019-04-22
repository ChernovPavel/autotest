import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleTests {

    @Parameterized.Parameter()
    public int a;

    @Parameterized.Parameter(1)
    public int b;

    @Parameterized.Parameter(2)
    public int c;

    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters (name = "a= {0} b={1} c={2} : result - {3}")
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {5, 4, 3, true},
                {0, 10, 1, false},
                {1, 0, 9, false},
                {7, 7, 0, false},
                {2, 9, 8, true},
                {1, 1, 5, false},
                {-14, -15, -28, false},
                {0, 0, 0, false},
                {1, -5, 12, false}
        });
    }

    @Test
    public void isTriangleShouldTriangleExists() {
        Triangle triangle = new Triangle(a, b, c);
        //проверка существования треугольника с заданными сторонами
        boolean actual = triangle.isTriangle();
        assertEquals(expected, actual);
    }

}
