package strategy;

/*
 * @author Jevgenijs A.
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDwawSquare() {
        Square square = new Square();
        StringBuilder answer = new StringBuilder();
        answer.append(" ----");
        answer.append(System.lineSeparator());
        answer.append("|    |");
        answer.append(System.lineSeparator());
        answer.append("|    |");
        answer.append(System.lineSeparator());
        answer.append(" ----");
        assertThat(answer.toString(), is(square.draw()));
    }
}
