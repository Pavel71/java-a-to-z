package ru.pmishagin.rally;


public class Loops {

    public static void main (String [] args){

        boolean expression = true;
        int counter = 0;

    /* while(expression){

         System.out.println(loop);
         loop++;//count=count+1
         expression = loop < 10;
     }
       System.out.println("finish loop while ");
       */

    /* do{
         System.out.println("Menu");

                 loop++;
                 expression = loop < 5;

     }while (expression);

     System.out.println("finish loop do while ");
     */

    for( int index = 0; index<10;index++){

        if (index % 2 == 0){
            continue;
        }
        System.out.println("for : "+ index);
    }
    System.out.println("finish for ");


     /*for (String arg : args){

         System.out.println(arg);
     }

     System.out.println("For Massiv args ");
     */


    }

}
