package tracker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        Item item2 = new Item("test2", "testDescription2", 124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.replace(item2.getId(), item.getName(), item.getDescription());
        assertThat(tracker.findAll()[1].getName(), is(item.getName()));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription", 123L);
        tracker.add(item1);
        tracker.delete(item1.getId());
        assertThat(tracker.findAll().length, is(0));
    }

    @Test
    public void whenFindByNameItem() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("test3", "testDescription3", 125L);
        tracker.add(item3);
        Item[] newArr = tracker.findByName(item3.getName());
        assertThat(newArr[0].getId(), is(item3.getId()));
    }

    @Test
    public void whenFindByIdItem() {
        Tracker tracker = new Tracker();
        Item item3 = new Item("test3", "testDescription3", 125L);
        tracker.add(item3);
        Item newItem = tracker.findById(item3.getId());
        assertThat(newItem.getName(), is(item3.getName()));
    }
}
