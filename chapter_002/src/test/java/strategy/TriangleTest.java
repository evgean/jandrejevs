package strategy;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDwawTriangle() {
        Triangle triangle = new Triangle();
        StringBuilder answer = new StringBuilder();
        answer.append("   ^  ");
        answer.append(System.lineSeparator());
        answer.append("  - - ");
        answer.append(System.lineSeparator());
        answer.append(" -   -");
        answer.append(System.lineSeparator());
        answer.append("-------");
        assertThat(answer.toString(), is(triangle.draw()));
    }
}
