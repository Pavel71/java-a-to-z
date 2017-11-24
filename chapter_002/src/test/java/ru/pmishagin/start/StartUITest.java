package ru.pmishagin.start;

import ru.pmishagin.models.*;

import ru.pmishagin.interfaces.Input;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 *  Input intrface.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.11.2017
 */
/**
 *
 *  Класс для тестирования трекира
 *
 */
public class StartUITest {


    /**
     * Метод проверки добавления заявки
     */

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {

        Tracker tracker = new Tracker();     // создаём Tracker

        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий

        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()

        assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }


    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {

        Tracker tracker = new Tracker();

       // Item item = tracker.add(new Item()); //Упрощенное описание

        Item item1 = new Item("Name", "Description");

        tracker.add(item1);


        Input input = new StubInput(new String[]{"2", "test name", "desc", item1.getId(), "6"});

        new StartUI(input, tracker).init();

        assertThat(tracker.findById(item1.getId()).getName(), is("test name"));
    }

    @Test

    public void whenUserhaveDelitem() {

        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item());

        Input input = new StubInput(new String[] {"3", item.getId(), "6"});

        new StartUI(input, tracker).init();

        assertThat(null, is(tracker.getAll()[0]));


    }
    @Test

    public void whenUserhaveFinditemByid() {

        Tracker tracker = new Tracker();

        Item item = new Item("PAPA", "PPPPPPP");

        tracker.add(item);

        Input input = new StubInput(new String[] {"4", item.getId(), "6"});

        new StartUI(input, tracker).init();

        assertThat(tracker.findById(item.getId()).getName(), is("PAPA"));


    }
    @Test

    public void whenUserhaveFinditemByname() {

        Tracker tracker = new Tracker();

        Item item = new Item("PAPA", "PPP");

        tracker.add(item);

        Input input = new StubInput(new String[] {"5", "PAPA", "6"});

        new StartUI(input, tracker).init();

        assertThat(tracker.findByName(item.getName()).getDescription(), is("PPP"));


    }

}
