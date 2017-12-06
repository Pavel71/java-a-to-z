package ru.pmishagin.user;

import java.util.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 05.12.2017
 */
public class SortUser {


    public Set<User> sort(List<User> list) {


        Set<User> sortset = new TreeSet<>();

        sortset.addAll(list);


        return sortset;

    }

    public List<User> sortNameLength(List<User> list) {

        list.sort(new Comparator<User>() {

            @Override

            public int compare(User o1, User o2) {

                return  Integer.compare(o1.getName().length(), o2.getName().length());

            }
        }); return list;

    }

    public List<User> sortByAllFields(List<User> list) {

        list.sort(new Comparator<User>() {

            @Override
            public int compare(User left, User right) {

                  int rsl = left.getName().compareTo(right.getName());

                  return rsl != 0 ? rsl : Integer.compare(left.getAge(), right.getAge());

            }
        }); return list;

    }




    public static void main(String[] args) {

        Set<User> users = new TreeSet<>();

        users.addAll(Arrays.asList(new User("Pavel", "Tula", 20), new User("Petr", "Bransk", 21), new User("Pavel", "Moskva", 25)));

        //System.out.println("Set с имплементацией интерфейса в User и оверрайд метода compareTo(по 2м условиям) :" + users);




        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(new User("Pankrat", "Tula", 25), new User("Pavel", "Tula", 21), new User("Pontii", "Tula", 20)));

        System.out.println(" Просто список лист " + list);

        System.out.println("лист отсортрованный по длине имен: " + new SortUser().sortNameLength(list));






        // Метод Сорт компоратор для списка Лист Если 1 значит правый больше левого сли -1 значит меньше 0 равно

        list.sort(new Comparator<User>() {
            @Override
            public int compare(final User left, final User right) {

                // Если 2 условия!!!////

              //  int rsl = left.getName().compareTo(right.getName()); // Сначало сравниваем по имени

              //  return rsl != 0 ? rsl : Integer.compare(left.getAge(), right.getAge()); //Если имена одинаковые сравниваем по возрасту

                // Если 3 и более условий проверки!Это правельная запись по чекстайлу!////


                if ((left.getName().compareTo(right.getName())) != 0) {
                    return left.getName().compareTo(right.getName());
                }
                if ((left.getCity().compareTo(right.getCity())) != 0) {
                    return (left.getCity().compareTo(right.getCity()));
                }
                if ((Integer.compare(left.getAge(), right.getAge())) != 0) {
                    return Integer.compare(left.getAge(), right.getAge());
                }

                return 0;

            }
        });

        //System.out.println("Компаратор Листа через метод compare(по 3м условиям) : " + list);





    }



}
