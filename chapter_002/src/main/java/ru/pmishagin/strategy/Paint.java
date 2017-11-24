package ru.pmishagin.strategy;

import ru.pmishagin.interfaces.Shape;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 23.11.2017
 */

/**
 * Класс Paint отвечает за действие вывести на экран картинку!
 * Принимает объект интерфейса(тоесть любой объект класса инмплементируюий интерфейс Shape=Треугоьник,Квадрат)
 */

public class Paint {

    /**
     * Метод реализует метод вывода картинки на кран
     * @param shape
     */


    public void draw(Shape shape) {

        System.out.println(shape.pic());

    }

    public static void main(String[] args) {

      //  Paint paint = new Paint();

       // Shape square = new Square();

       // Shape triangle = new Triangle();

        //paint.draw(square);

        new Paint().draw(new Square());


        //System.out.println(new Paint().draw(new Square()) + "\n" + new Paint().draw(new Triangle()));


    }
}
