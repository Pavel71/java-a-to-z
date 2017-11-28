package ru.pmishagin.start;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 28.11.2017
 */
public class ValidateInput extends ConsoleInput {

    public int ask(String question, int[] range) {

        boolean invalid = true;
        int value = -1;

        do {
            try {

                value = super.ask(question, range);
                invalid = false;

            } catch (MenuOutExeption moe) {

                System.out.println("Введите пожалуйста пункты меню в диапозоне(0-6)");

            } catch (NumberFormatException nfe) {

                System.out.println("Введите цифру меню!");

            }
        } while (invalid);

        return value;
    }

}
