package ru.pmishagin.taskjob4j;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 06.12.2017
 */
public class User {

    private String name;

    private int passport;

    public User(String name, int passport) {


        this.name = name;
        this.passport = passport;
    }

    public String getName() {

        return this.name;
    }

    public int getPassport() {

        return this.passport;
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

        if (passport != user.passport) {

            return false;
        }
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + passport;
        return result;
    }

    @Override
    public String toString() {
        return "Имя: " + name  + ", Паспорт: " + passport + "; ";
    }
}
