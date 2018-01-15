package ru.pmishagin.multithreading.multisearch;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 15.01.2018
 */
public class MainTest {

    public static void main(String[] args) throws InterruptedException {

        String dir = "C:";

        String text = "MyFileVisitorParallSearch";

        String extc = "java";



        MyFileVisitorParallSearch myfl = new MyFileVisitorParallSearch(extc);

        ThreadFindText threadFind = new ThreadFindText(text, myfl);
        ThreadSearch threadSearch = new ThreadSearch(dir, myfl);



        Long startTime = System.currentTimeMillis();


        threadSearch.start();
        threadSearch.join();

        threadFind.start();
        threadFind.join();


        Long finishTime = System.currentTimeMillis() - startTime;


        for (String element : myfl.getResultlist()) {

            System.out.println(element);
        }


        System.out.println(finishTime);





    }


}
