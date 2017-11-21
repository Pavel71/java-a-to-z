package ru.pmishagin.start;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.pmishagin.models.Item;


/**
 * Created by Home on 20.11.2017.
 */
public class TrackerTest {

    @Test

   public void whenAddNewItemThenTrackerHasSameItem() {


        Tracker tracker = new Tracker();

        Item item1 = new Item("Pupa", "Pepa", 1234L);

        tracker.add(item1);

        assertThat(tracker.getAll()[0], is(item1));


    }

    @Test

    public void whenSearchItemForId() {


        Tracker tracker = new Tracker();

        Item item1 = new Item("Pupa", "Pepa", 1234L);

        tracker.add(item1);

        assertThat(tracker.findById(item1.getId()), is(item1));

    }

    @Test


    public void whenItemUpdate() {

        Tracker tracker = new Tracker();

        Item item1 = new Item("Pupa", "Pepa", 1234L);

        tracker.add(item1);

        Item item2 = new Item("Muma", "Mema", 23213L);

        tracker.add(item2);

        item2.setId(item1.getId());

        tracker.update(item2);

        assertThat(tracker.findById(item1.getId()).getName(), is("Muma"));


    }

    @Test

    public void whendellItemnull() {

        Tracker tracker = new Tracker();

        Item item1 = new Item("Pupa", "Pepa", 1234L);

        tracker.add(item1);

        tracker.delete(item1);

        assertThat(null, is(tracker.getAll()[0]));


    }

    @Test

    public void whenSearcItebyName() {

        Tracker tracker = new Tracker();

        Item item1 = new Item("Pupa", "Pepa", 1234L);

        tracker.add(item1);

        assertThat(tracker.getAll()[0], is(tracker.findByName("Pupa")));

    }


}
