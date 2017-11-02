package ru.pmishagin.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import java.util.Arrays;


/**
 * Test.
 *
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version $1.0$
 * @since 30.10.2017
 *
 */
  public class ArrayDuplicatTest {

      @Test

      public void Dublicatebackclean() {

        String[] num = {"1","1","3","3"};


        ArrayDuplicat dubl = new ArrayDuplicat();

        String[] result = dubl.remove(num);

        String[] expected = {"1","3"};

        assertArrayEquals(result, expected);


      }
  }


