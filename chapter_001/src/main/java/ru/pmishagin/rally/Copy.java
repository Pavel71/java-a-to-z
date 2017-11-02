package ru.pmishagin.rally;



public class Copy {



    public int [] copyPartArray(int[] a, int start) {

        if (a == null)
            return null;

        if (start > a.length)
            return null;

        int [] r = new int [a.length - start];

        System.arraycopy(a, start, r, 0, a.length - start);

        return r;

    }

    //public void onClick() {

       // double[] digits = new double[] {6.5, 3.1, 5.72};

      //  double[] part = copyPartArray(digits, 1);


    //}
}
