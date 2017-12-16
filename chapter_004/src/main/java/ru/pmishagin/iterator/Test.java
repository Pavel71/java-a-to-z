package ru.pmishagin.iterator;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 11.12.2017
 */
public class Test {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


        Test test = new Test();

        for (int i = 1; i < 100; i++) {

            if (test.primenumber(i)) {

                test.list.add(i);
            }

        }




        System.out.println(test.list);


    }


    public boolean primenumber(int i) {

        for (int j = 2; j < i; j++) {

            if (i % j == 0) {

               return false;

            }

        } return true;

    }

    public List<Integer> getList() {

        return this.list;
    }



}
