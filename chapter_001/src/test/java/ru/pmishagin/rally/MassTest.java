package ru.pmishagin.rally;
import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;


/**
 * Test.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version $1.0$
 * @since 05.11.2017
 *
 */

public class MassTest {

    @Test

    public void FactorialArrayTest(){

        int arr [] ={1,2,3,4,5};

        Mass mas = new Mass();

        int result  = mas.factorial(arr);

        int expected = 120;

        assertThat(result, is(expected));




    }

}
