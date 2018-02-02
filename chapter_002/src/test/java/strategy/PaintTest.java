package strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        StringBuilder answer = new StringBuilder();
        answer.append(" ----");
        answer.append(System.lineSeparator());
        answer.append("|    |");
        answer.append(System.lineSeparator());
        answer.append("|    |");
        answer.append(System.lineSeparator());
        answer.append(" ----");
        answer.append(System.lineSeparator());
        assertThat(
                new String(out.toByteArray()),
                is(answer.toString())
        );
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        StringBuilder answer = new StringBuilder();
        answer.append("   ^  ");
        answer.append(System.lineSeparator());
        answer.append("  - - ");
        answer.append(System.lineSeparator());
        answer.append(" -   -");
        answer.append(System.lineSeparator());
        answer.append("-------");
        answer.append(System.lineSeparator());
        assertThat(
                new String(out.toByteArray()),
                is(answer.toString())
        );
        System.setOut(stdout);
    }
}
