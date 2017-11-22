package ru.pmishagin.start;

import com.sun.org.apache.xpath.internal.SourceTree;
import ru.pmishagin.models.*;
import ru.pmishagin.start.interfaces.Input;


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
    private static final String ADD = "0";

    private static final String SHOWALL = "1";

    private static final String EDIT = "2";

    private static final String DEL = "3";

    private static final String ID = "4";

    private static final String NAME = "5";

    private static final String EXIT = "6";


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


        new StartUI(new ConsoleInput(), new Tracker()).init();

    }

    /**
     * Выводит доступные операции
     */
    private void showMenu() {

        System.out.println("Меню." + "\n" + "0. Add new Item" + "\n" +  "1. Show all items" + "\n" + "2. Edit item" + "\n"
                + "3. Delete item" + "\n" + "4. Find item by Id" + "\n" + "5. Find items by name" + "\n" + "6. Exit Program");

    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.ADD = 0
     */
    private void createItem() {

        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }


    /**
     * Метод реализует обновление заявки.EDIT = 2
     */
    private void updateItem() {

        System.out.println("------------ Обновение заявки --------------");

        String name = this.input.ask("Введите имя новой заявки :");
        String desc = this.input.ask("Введите описание новой заявки :");
        Item item = new Item(name, desc);

        String id = this.input.ask("Введите ID старой заявки :");

        item.setId(id);

        tracker.update(item);

        System.out.println("------------ Заявка обновленна -----------");
    }

    /**
     * Метод удаляет заявку.DEL = 3
     */

    private void deleteItem() {

        System.out.println("------------ Удаление заявки --------------");

        Item item = new Item("Dell", "Dell");

        String id = this.input.ask("Введите ID заявки которую хотите удалить! :");

        item.setId(id);

        tracker.delete(item);

        System.out.println("------------ Заявка удаленна -----------");


    }

    /**
     * Метод ищет заявку по id.ID = 4
     */

    private void findItemID() {

        System.out.println("------------ Поиск заявки по ID --------------");

        Item result = tracker.findById(this.input.ask("Введите ID"));

        System.out.println(" Name : " + result.getName() + " " + "Description: " + result.description);

        System.out.println("------------ Поиск завершон --------------");

    }

    /**
     * Метод ищет заявку по Ключу.NAME = 5
     */
    private void findItemName() {

        System.out.println("------------ Поиск заявки по Name --------------");

        Item result = tracker.findByName(this.input.ask("Введите Name"));

        System.out.println(" Name : " + result.getName() + " " + "Description: " + result.description + " " + "Id: " + result.getId());

        System.out.println("------------ Поиск завершон --------------");

    }

    /**
     * Метод меню.Содержит цикл.
     */
    public void init() {

        boolean exit = false;

        while (!exit) {

            this.showMenu();

            String answer = this.input.ask("Введите пункт меню : ");

            if (ADD.equals(answer)) {
                //Добавление заявки в этом методе
                this.createItem();

            } else if (SHOWALL.equals(answer)) {

                tracker.showAllItem();


            } else if (EDIT.equals(answer)) {

                this.updateItem();


            } else if (DEL.equals(answer)) {

                this.deleteItem();


            } else if (ID.equals(answer)) {

                this.findItemID();


            } else if (NAME.equals(answer)) {

                this.findItemName();


            } else if (EXIT.equals(answer)) {

                exit = true;

            }

        }

    }
}
