package ru.pmishagin.multithreading.userstoreage;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.01.2018
 */
public class User {

    private int id;

    private int amount;


    public User(int id, int amount) {

        this.amount = amount;

        this.id = id;
    }

    public void setAmount(int amount) {

        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {

            return true;
        }
        if (o == null || getClass() != o.getClass()) {

            return false;
        }

        User user = (User) o;

        if (id != user.id) {

            return false;
        }
        return amount == user.amount;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + amount;
        return result;
    }
}
