package ru.pmishagin.regexpractic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 13.01.2018
 */
public class Main {

    /**
     * Здесь тестируется замена слов которые начинаются на Jon! .-означает слово продолжается
     * *-любое количестов символов ?-Означает что символы могут и не идти после Jon
     * Также обращаю внимание что в регекс стоит проблем в конце \\s
     */


    public static void replacyAllRegx(String text, String regx) {

        Pattern p = Pattern.compile(regx);

        Matcher m = p.matcher(text);

        System.out.println("Deffoult string: " + text);

        text = m.replaceAll("Pipa ");

        System.out.println("Replacy str: " + text);
    }

    /**
     * Эта программа ищет слово начинающеяся на цифры!
     */

    public static void numberSearch(String text, String regx) {

        Pattern p = Pattern.compile(regx);

        Matcher m = p.matcher(text);

        while (m.find()) {

            String matchedText = m.group();
            int matchedFrom = m.start();
            int matchedTo = m.end();

            System.out.println("matched [" + matchedText + "] " + "from " + matchedFrom + " to " + matchedTo + ".");
        }
    }

    /**
     * Программа выводи лексемы без знаков
     * @param text
     * @param regx
     */

    public static void lecsemVoid(String text, String regx) {

        Pattern p = Pattern.compile(regx);

        String[] strs = p.split(text);

        for (String element : strs) {

            System.out.println("Lecsem: " + element);
        }

    }

    public static void main(String[] args) {

        String regex1 = "Jon.*?\\s";
        String str1 = "Jon Jonathan Pavel Mark";

        replacyAllRegx(str1, regex1);

        System.out.println("\n---------------------------------\n");

        String myText = "this is my 123st test 12 2nd string 3hd";
        String myRegex = "\\d+[a-z]+"; // регулярное выражение \d+\w+

        numberSearch(myText, myRegex);

        System.out.println("\n---------------------------------\n");


        String text = "12Pas. asd! asdd, asd.";
        String regex = "[,.!;]";

        lecsemVoid(text, regex);




    }


}
