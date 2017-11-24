package ru.pmishagin.strategy;


import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 23.11.2017
 */
public class PaintTest {
    /**
     *
     * Тестирует метод Paint Чтобы понять как рисуется картинка мы преобразуем данные в байт код
     * и сравниваем их с картинкой
     *
     */

    @Test
    public void whenDrawSquare() {

        PrintStream stdout = System.out; // получаем ссылку на стандартный вывод в консоль//

        ByteArrayOutputStream out = new ByteArrayOutputStream();     // Создаем буфур для хранения вывода//

        System.setOut(new PrintStream(out)); //Заменяем стандартный вывод на вывод в пямять для тестирования//

        new Paint().draw(new Square());     // выполняем действия пишушиее в консоль//

        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                                .append("++++" + "\n")
                                .append("++++" + "\n")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()));

        System.setOut(stdout); // возвращаем обратно стандартный вывод в консоль.
    }
    @Test
    public void whenDrawTriangle() {

        PrintStream stdout = System.out;

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));

        new Paint().draw(new Triangle());

        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                     .append("      + " + "\n")
                .append("    + + +" + "\n")
                .append("  + + + + +" + "\n")
                .append("+ + + + + + +")
                .append(System.lineSeparator())
                .toString()));

        System.setOut(stdout);
    }
}
