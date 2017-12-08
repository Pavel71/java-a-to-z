package ru.pmishagin.taskjob4j;

import java.util.Random;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 06.12.2017
 */
public class Accounts {


    private static final Random RN = new Random();

    private double value;

    private long requisites;



    public Accounts() {

    }

  public Accounts(double value) {

      this.value = value;

  }

  public long setRequisites(long requisites) {

      this.requisites = requisites;

      return requisites;

  }


  public double getValue() {

        return this.value;
  }

  public double  setValue(double value) {

        this.value = value;

        return value;
    }




  public long generateRequisites() {

      return RN.nextInt(10000) * RN.nextInt(10000);

  }


    @Override
    public boolean equals(Object o) {
        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }

        Accounts accounts = (Accounts) o;

        if (Double.compare(accounts.value, value) != 0) {

            return false;
        }
        return requisites == accounts.requisites;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (requisites ^ (requisites >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Счет:" + value + " = рублей" + " " + "Реквизиты: " + requisites + "; ";
    }
}
