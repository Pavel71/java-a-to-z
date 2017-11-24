package ru.pmishagin.start;

import ru.pmishagin.interfaces.Input;
import ru.pmishagin.interfaces.UserAction;
import ru.pmishagin.models.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 24.11.2017
 */


/**
 * Класс Меню! С помощью которого мы работаем с входящей информацией(Input) и хранилищем-оператором(Tracker)
 *
 */

public class MenuTracker {

    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[7];

    /**
     * Конструктор Menu
     * @param input - входная информация
     * @param tracker-хранилище
     */

    public MenuTracker(Input input, Tracker tracker) {

        this.input = input;
        this.tracker = tracker;
    }

    /**
     *Метод инициализурет ключи для команд в массиве actuions
     * Удобно его использовать для цикла
     */

    public void fillActions() {

        this.actions[0] = new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new UpdateItem();
        this.actions[3] = new Delete();
        this.actions[4] = new FindItemById();
        this.actions[5] = new FindItemByName();
        this.actions[6] = new Exit();

    }

    /**
     * Метод select связывает входящий ключ с методом класса
     * Этот метод активирует метод действия
     * @param key
     */

    public void select(int key) {

        this.actions[key].execute(input, tracker);
    }

    /**
     * Метод выводит на экран все добавленные операции!
     */

    public void show() {

        for (UserAction action : this.actions) {

            if (action != null) {

                System.out.println(action.info());
            }

        }
    }
         //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс ADD = 0
     *
     * Добавляет заявку в хранилище!
     * @key Ключ запуска для добавления
     * @execute Метод действия
     * @info Выводит описывающую информацию.
     *
     */
    private class AddItem implements UserAction {


        public int key() {

            return 0;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ Please add Item ------------");

            String name = input.ask("Введите имя новой заявки :");
            String desc = input.ask("Введите описание новой заявки :");
            Item item = new Item(name, desc);

            tracker.add(item);

            System.out.println("------------ New Item getId : " + item.getId() + "-----------");


        }

        public String info() {

            return String.format("%s. %s", this.key(), "Add new Item");

        }
    }
    //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс ShowItems = 1
     *
     * Выводит на экран все заявки.
     * @key Ключ запуска для добавления.
     * @execute Метод действия.
     * @info Выводит описывающую информацию  действия.
     *
     */
    private static class ShowItems implements UserAction {


        public int key() {

            return 1;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ All Items! ------------");

            for (Item item : tracker.getAll()) {

                System.out.println(String.format("%s. %s. %s", "Name item : " + item.getName(), "Desc item : " + item.getDescription(), "ID item : " + item.getId()));


            }

        }

        public String info() {

            return String.format("%s. %s", this.key(), "Show all Item");

        }
    }
    //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс Update = 2
     *
     * Обновляет заявку в хранилище.
     * @key Ключ запуска для добавления.
     * @execute Метод действия.
     * @info Выводит описывающую информацию.
     *
     */
    class UpdateItem implements UserAction {

        public int key() {

            return 2;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ Please update Item ------------");


            String name = input.ask("Insert new name :");
            String desc = input.ask("Insert new desc :");

            Item item = new Item(name, desc);

            String id = input.ask("Insert id : ");

            item.setId(id);

            tracker.update(item);

            System.out.println("------------ Item update! ------------");


        }

        public String info() {

            return String.format("%s. %s", this.key(), "Update Item");

        }


    }
    //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс Delete = 3
     *
     * Удаляет заявку из хранилища, а именно присваивает ей null.
     * @key Ключ запуска для добавления.
     * @execute Метод действия.
     * @info Выводит описывающую информацию.
     *
     */
    class Delete implements UserAction {

        public int key() {

            return 3;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ Please delete item ------------");


            String id = input.ask("Item id : ");

            tracker.delete(tracker.findById(id));

            System.out.println("------------ Item delete! ------------");


        }

        public String info() {

            return String.format("%s. %s", this.key(), "Delete Item");

        }


    }
    //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс FindItemById = 4
     *
     * Ищет заявку по ID.
     * @key Ключ запуска для добавления.
     * @execute Метод действия.
     * @info Выводит описывающую информацию.
     *
     */
    class FindItemById implements UserAction {

        public int key() {

            return 4;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ Search item by ID ------------");


            String id = input.ask("Введите id заявки которую хотите найти : ");


            System.out.println("Имя заявки : " + tracker.findById(id).getName() + " Описание заявки : " + tracker.findById(id).getDescription() + " ID заявки " + id);

            System.out.println("------------ Item fiend! ------------");
        }

        public String info() {

            return String.format("%s. %s", this.key(), "Search by ID");

        }


    }
    //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс FindItemByName = 5
     *
     * Ищет заявку по строке имени.
     * @key Ключ запуска для добавления.
     * @execute Метод действия.
     * @info Выводит описывающую информацию.
     *
     */
    class FindItemByName implements UserAction {

        public int key() {

            return 5;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ Search item by name ------------");


            String key = input.ask("Введите Имя заявки которую хотите найти : ");


            System.out.println("Имя заявки : " + tracker.findByName(key).getName() + " Описание заявки : " + tracker.findByName(key).getDescription() + " ID заявки " + tracker.findByName(key).getId());

            System.out.println("------------ Item fiend! ------------");
        }

        public String info() {

            return String.format("%s. %s", this.key(), "Search by Name");

        }


    }
    //////////////////////////////////////Class////////////////////////////
    /**
     * Внутренний класс Exit = 6
     *
     * Закрывает программу
     * @key Ключ запуска для добавления.
     * @execute Метод действия.
     * @info Выводит описывающую информацию.
     *
     */
    class Exit implements UserAction {

        public int key() {

            return 6;
        }

        public void execute(Input input, Tracker tracker) {

            System.out.println("------------ Escape program! ------------");


        }



        public String info() {

            return String.format("%s. %s", this.key(), "Exit");

        }


    }


}

