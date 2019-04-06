import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TriangleTests {
    public int a;
    public int b;
    public int c;
    public boolean expected;

    public TriangleTests(int a, int b, int c, boolean expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {5, 4, 3, true},
                {2, 9, 8, true},
                {1, 1, 5, false},
                {14, 15, 28, true},
                {1, 5, 12, false},
                {0, 0, 0, false},
                {1, -5, 12, false}
        });
    }

    @Test
    public void IsTriangleShouldTriangleExists() {
        Triangle t = new Triangle();
        boolean actual = t.isTriangle(a, b, c);
        assertEquals(expected, actual);
    }

}
