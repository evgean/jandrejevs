package tracker;

/*
 * Test
 *
 *@author Jevgenijs
 *@version $Id$
 *@since 0.1
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddNewItem() {
        Tracker tracker = new Tracker();
        String[] answers = {"0", "Vova", "is my friend", "6"};
        Input input = new StubInput(answers);
        new StartUI(new Actions(new Decoration(), tracker, input)).init();
        assertThat(tracker.findAll()[0].getName(), is("Vova"));
    }

    @Test
    public void whenEditItem() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Vova", "is my firend", 2L));
        String[] answers = {"2", tracker.findAll()[0].getId(), "0", "Petja", "6"};
        Input input = new StubInput(answers);
        new StartUI(new Actions(new Decoration(), tracker, input)).init();
        assertThat(tracker.findAll()[0].getName(), is("Petja"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Vova", "is my firend", 2L));
        String[] answers = {"3", tracker.findAll()[0].getId(), "6"};
        Input input = new StubInput(answers);
        new StartUI(new Actions(new Decoration(), tracker, input)).init();
        assertThat(tracker.findAll().length, is(0));
    }
}
