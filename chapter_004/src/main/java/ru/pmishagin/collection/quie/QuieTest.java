package ru.pmishagin.collection.quie;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 18.01.2018
 */
public class QuieTest {

    public static void main(String[] args) {


        ArrayQueue<Integer> arrque = new ArrayQueue<>(3);
//
//        arrque.add(10);
//        arrque.add(15);
//        arrque.add(20);
//
//        for (Integer elem : arrque) {
//
//            System.out.println(elem);
//        }

//        PriorityQueue<Integer> prior = new PriorityQueue<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//
//                if ((o1 %2) == (o2 %2)) {
//
//                    if (o1 < o2) {
//
//                        return -1;
//                    } else return 1;
//                }
//                if ((o1 %2) < (o2 %2)) {
//
//                    return -1;
//                } else return 1;
//
//
//
//            }
//        });
//
//        prior.add(1);
//        prior.add(2);
//        prior.add(4);
//        prior.add(3);
//        prior.add(5);
//        prior.add(7);
//        prior.add(6);
//        prior.add(2);
//        prior.add(4);
//
//        while (!prior.isEmpty()) {
//
//            System.out.println(prior.poll());
//        }

        Queue<Integer> linkedque = new LinkedList<>();

        linkedque.add(10);
        linkedque.offer(15);
        //linkedque.poll();
        //linkedque.remove();


        System.out.println(linkedque);

//        ArrayDeque<String> states = new ArrayDeque<String>();
//        // стандартное добавление элементов
//        states.add("Германия");
//        states.add("Франция");
//        // добавляем элемент в самое начало
//        states.push("Великобритания");
//
//        // получаем первый элемент без удаления
//        String sFirst = states.getFirst();
//        String sLast = states.getLast();
//
//
//        while(states.peek() != null){
//            // извлечение c начала
//            System.out.println(states.pop());
//        }
//        System.out.printf("Размер очереди: %d \n", states.size());



    }
}
