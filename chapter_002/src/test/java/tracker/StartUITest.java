package tracker;

/*
 * Test
 *
 *@author Jevgenijs A.
 *@version $Id$
 *@since 0.1
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void back() {
        System.setOut(this.stdout);
    }


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

    @Test
    public void whenShowAllItems() {
        Tracker tracker = new Tracker();
        String[] answers = {"0", "Vova", "is my friend", "1", "6"};
        Input input = new StubInput(answers);
        new StartUI(new Actions(new Decoration(), tracker, input)).init();
        StringBuilder uiText = new StringBuilder();
        uiText.append("**** MENU: SHOW ALL ITEMS ****");
        uiText.append(System.lineSeparator());
        uiText.append("++ item N1");
        uiText.append(System.lineSeparator());
        uiText.append("ID: ");
        uiText.append(tracker.findAll()[0].getId());
        uiText.append(System.lineSeparator());
        uiText.append("Name: Vova");
        uiText.append(System.lineSeparator());
        uiText.append("Description: is my friend");
        uiText.append(System.lineSeparator());
        uiText.append("---------");
        uiText.append(System.lineSeparator());
        String cutAnswer = new String(out.toByteArray());
        assertThat(cutAnswer.substring(673, 786), is(uiText.toString()));
    }

    @Test
    public void whenFIBI() {
        Tracker tracker = new Tracker();
        Item item = new Item("Vova", "is my friend", 2L);
        tracker.add(item);
        String id = tracker.findAll()[0].getId();
        String[] answers = {"4", id, "6"};
        Input input = new StubInput(answers);
        new StartUI(new Actions(new Decoration(), tracker, input)).init();
        StringBuilder uiText = new StringBuilder();
        uiText.append("ID: ");
        uiText.append(tracker.findAll()[0].getId());
        uiText.append(System.lineSeparator());
        uiText.append("Name: Vova");
        uiText.append(System.lineSeparator());
        uiText.append("Description: is my friend");
        uiText.append(System.lineSeparator());
        uiText.append("---------");
        uiText.append(System.lineSeparator());
        String cutAnswer = new String(out.toByteArray());
        assertThat(cutAnswer.substring(395, 464), is(uiText.toString()));
    }

    @Test
    public void whenFIBN() {
        Tracker tracker = new Tracker();
        Item item = new Item("Vova", "is my friend", 2L);
        tracker.add(item);
        String[] answers = {"5", "Vova", "6"};
        Input input = new StubInput(answers);
        new StartUI(new Actions(new Decoration(), tracker, input)).init();
        StringBuilder uiText = new StringBuilder();
        uiText.append("ID: ");
        uiText.append(tracker.findAll()[0].getId());
        uiText.append(System.lineSeparator());
        uiText.append("Name: Vova");
        uiText.append(System.lineSeparator());
        uiText.append("Description: is my friend");
        uiText.append(System.lineSeparator());
        uiText.append("---------");
        uiText.append(System.lineSeparator());
        String cutAnswer = new String(out.toByteArray());
        assertThat(cutAnswer.substring(329, 398), is(uiText.toString()));
    }
}
