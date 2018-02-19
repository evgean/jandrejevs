package strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/*
* @author Jevgenijs A.
* @version $Id$
* @since 0.1
 */

public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
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
    }

    @Test
    public void whenDrawTriangle() {
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
    }
}
