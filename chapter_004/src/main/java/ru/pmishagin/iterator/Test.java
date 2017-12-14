package ru.pmishagin.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 11.12.2017
 */
public class Test {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, -1, -2, 8, 9, 10};

        //System.out.println(prime(arr));

        Test test = new Test();

        System.out.println(test.ifreturn(3));


    }

    public static List<Integer> prime(int[] arr) {

        List<Integer> primelist = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            boolean prime = true;


            for (int j = 2; j < arr[i]; j++) {

                if (arr[i] % j == 0) {

                    prime = false;

                }

            }  if (prime) {

                primelist.add(arr[i]);
            }

        } return primelist;


    }

    public  int ifreturn(int x) {

        int result = 0;

        for (int i = 0; i < 3; i++) {

            result = i + x;

        } return x + 3;

    }
}
