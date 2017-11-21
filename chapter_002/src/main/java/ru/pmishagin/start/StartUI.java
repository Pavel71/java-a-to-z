package ru.pmishagin.start;

import ru.pmishagin.models.*;
import ru.pmishagin.start.interfaces.Input;


/**
 *
 * Class для запуска программы,здесь находится статик маин
 * Created by Home on 10.11.2017.
 */


public class StartUI {

    private Input input;

    public StartUI(Input input) {

        this.input = input;
    }

    public void init() {

        String name = input.ask("Please Task name: ");

        Tracker tracker = new Tracker();

        tracker.add(new Task(name, "First Desc"));

        for (Item item : tracker.getAll()) {

            System.out.println(item.getName());

        }
    }

    public static void main(String[] args) {

        Input input = new ConsoleInput();

        new StartUI(input).init();

    }
}
