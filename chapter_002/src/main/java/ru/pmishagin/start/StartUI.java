package ru.pmishagin.start;

import ru.pmishagin.interfaces.UserAction;
import ru.pmishagin.models.*;
import ru.pmishagin.interfaces.Input;


/**
 *
 * Class для запуска программы,здесь находится статик маин
 * Created by Home on 10.11.2017.
 */


public class StartUI {



    /**
     * Поле инпут для работы с классами стаб и консоль
     *
     */

    private final Input input;

    /**
     * Константы меню.
     */




    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    public static void main(String[] args) {


        new StartUI(new ValidateInput(), new Tracker()).init(); //Эта запись сделана с помощью полиморфизма

    }

    public void init() {

        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();

        UserAction deleteAction = new UserAction() {

            @Override
            public int key() {
                return 7;
            }

            @Override
            public void execute(Input input, Tracker tracker) {

            }

            @Override
            public String info() {

                return String.format("%s. %s", this.key(), "Delete(Anonim)");
            }
        };

        menu.addAction(deleteAction);

        int[] ranges = menu.getRange();

        int key;

        do {

            menu.show();
            //key = Integer.valueOf(input.ask("Введите номер нужной операции: "));
            //menu.select(key);

            key = input.ask("Выберете: ", ranges);

            menu.select(key);

        } while (key != 6);




    }
}
