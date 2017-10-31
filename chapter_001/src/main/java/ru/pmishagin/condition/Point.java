package ru.pmishagin.condition;

public class Point {


    public boolean is(int a, int b) {

        double temp = a * x + b;

        boolean rsl = false;
        if (b == y) {
            rsl = true;
        }
        return rsl;

        // используя координаты точки и вычисления функции.
    }



    public int x;
    public int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;


    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}