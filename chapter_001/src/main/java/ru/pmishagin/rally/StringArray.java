package ru.pmishagin.rally;

import java.util.Arrays;

/**
 *  Massif class.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 01.11.2017
 */

public class StringArray {



    public static void main(String[] args){


        String[] name = new String[] {"Юля","Марк","Паша","Марк","Юля","Кристина","Паша"};


        //for(int i = name.length - 1; i >0; i--){


          //  for(int j = 0; j<name.length;j++){

              //  if(name[j].equals(name[j+1]){

               //     String off = name[j];
                //    name[j]=name[i];
                //    name[i]=off;

              //  }

           // }

      String [] names= Arrays.copyOf(name,name.length-3);

       System.out.print(Arrays.toString(names));


    }


}
