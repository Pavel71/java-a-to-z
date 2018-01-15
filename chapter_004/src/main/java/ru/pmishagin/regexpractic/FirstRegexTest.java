package ru.pmishagin.regexpractic;

import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 10.01.2018
 */
public class FirstRegexTest {


        public void findReg(String text) {


        }

        public void replacyReg(String text, String replacy) {

        }


        public static void main(String[] args) {


            ////////////////////////////////////////////////////////////////

            String myText = "this is my 123st test 12 2nd string 3hd";

            String myRegex = "\\d+[a-z]+"; // регулярное выражение \d+\w+

            Pattern p = Pattern.compile(myRegex);

            Matcher m = p.matcher(myText);


            while (m.find()) {

                String matchedText = m.group();
                int matchedFrom = m.start();
                int matchedTo = m.end();

                System.out.println("matched [" + matchedText + "] " + "from " + matchedFrom + " to " + matchedTo + ".");

            }


            //////////////////////////////////////////////////////////////

            String regex = "\\w+"; // \w+
            String text = "Mastering Regular Expressions";

            Matcher m1 = Pattern.compile(regex).matcher(text);

            while (m1.find()) {

                System.out.println("match [" + m1.group() + "]");
            }

            ///////////////////////////////////////////////////////

            String text2 = "Before Java 1.5 was Java 1.4.2. After Java 1.5 is Java 1.6";
            String regex2 = "\\bJava\\s*1\\.5\\b";

            //Matcher m2 = Pattern.compile(regex2).matcher(text2);
            //String result = m2.replaceAll("Java 5.0");

            String result = Pattern.compile("\\bJava\\s*1\\.([56])\\b").matcher(text2).replaceAll("Java $1.0");



            System.out.println(result);


        }

}
