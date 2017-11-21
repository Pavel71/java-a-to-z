package ru.pmishagin.start;
import ru.pmishagin.start.interfaces.Input;

/**
 *  Input intrface.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 21.11.2017
 */
/**
 *
 *  Класс для реализации интерфейса(Ввод данных в консоль)
 *
 */
public class StartUITest {

    public static void main(String[] args) {

        Input input = new StubInput(new String[]{"Create stub task"});


        new StartUI(input).init();

    }


}
