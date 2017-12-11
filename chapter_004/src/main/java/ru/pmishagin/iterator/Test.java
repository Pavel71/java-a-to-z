package ru.pmishagin.iterator;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 11.12.2017
 */
public class Test {


    public static void main(String[] args) {



        int[][] val = new int[][] {
                {1, 2, 4, 5},
                {2, 3, 8}};

        for (int[] element :val) {

            for (int element2 : element) {

                //System.out.println(element2);
                System.out.println(val[1].length);
            }
        }

       // System.out.println(val.length);
    }
}
