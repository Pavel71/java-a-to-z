package ru.pmishagin.max;


public class Max{



    public int max(int first, int second) {

        int result = first > second ? first : second;
        return result;

    }

    public int max(int first, int second, int third) {

        int rsl = max(first, second);
        return max(rsl, third);
    }


}