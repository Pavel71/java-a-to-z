package ru.pmishagin.strategy;

import ru.pmishagin.interfaces.Shape;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 23.11.2017
 */
public class Triangle implements Shape  {

    /**
     *
     * Переопределяем метод интерфейса!
     * С помощью Стринг билдера и метода Аппенд добавляяем строки таким образом чтобы получился треугольник
     * @return
     */

    @Override
    public String pic() {

        StringBuilder pic = new StringBuilder();
        pic.append("      + " + "\n");
        pic.append("    + + +" + "\n");
        pic.append("  + + + + +" + "\n");
        pic.append("+ + + + + + +");
        return pic.toString();

    }


    //public String pic() {


    //}

}
