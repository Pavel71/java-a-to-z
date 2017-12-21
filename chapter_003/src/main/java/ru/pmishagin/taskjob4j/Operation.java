package ru.pmishagin.taskjob4j;

import java.util.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 06.12.2017
 */

/**
 *
 * Класс Operation
 * Отвечает за все действия по работе с базой данных!
 */
public class Operation {

    /**
     * Хранилище!Ключи User,значения Аккаунты(Списком)
     */

    private Map<User, List<Accounts>> usermap = new HashMap<>();



    /**
     * Возвращает Карту отображений
     */
    public Map<User, List<Accounts>> getUsermap() {

        return this.usermap;
    }


    /**
     *Добавляем пользователя в список(хранилище)
     * @param user
     */

    public void addUser(User user) {

        usermap.put(user, new ArrayList<>());


    }



    /**
     * Метод ищет юзера по ключу и удаляет его!
     * @param user
     */

    public void deleteUser(User user) {

        if (usermap.containsKey(user)) {

            usermap.remove(user);

        } else {

            throw new UserNotFoundExeption("--------- User not found! ---------");
        }



    }

    /**
     * Метод добавляет Привязыват account к ключу User!Ранее установенные пустые ключи пеезаписывает!
     * @param user
     * @param </Accounts> счетов account
     */

    public void addAccountToUser(User user, List<Accounts> account) {


        for (Accounts acc : account) {

            acc.setRequisites(acc.generateRequisites());
        }

            //Создаем список! Подгружаем сюда ранее существующие списки! и добавляем в него новый аккаунт!
        if (usermap.containsKey(user)) {

            List<Accounts> acclist = getUserAccounts(user);

            acclist.addAll(account);

            usermap.put(user, acclist);

        } else {

            throw new UserNotFoundExeption("--------- User not found! ---------");
        }

    }

    /**
     *
     * Метод удаляет счет пользователя, поиск осущевсляю c помощью итераторов!
     * @param user
     * @param account
     */

        public void deleteAccountFromUser(User user, Accounts account) {

            for (User userkey : usermap.keySet()) {

                if (userkey.equals(user)) {

                    List<Accounts> listacc = usermap.get(userkey);

                    Iterator<Accounts> itr = listacc.iterator();

                    while (itr.hasNext()) {

                        Accounts element = itr.next();

                        if (element.equals(account)) {

                            itr.remove();

                        }


                    }


                } else {

                    throw new UserNotFoundExeption("--------- User not found! ---------");
                }
            }

    }

    /**
     *Метод удалаяет values! Очень удобный и компактный метод.
     * @param user
     * @param account
     */
    public void dellAcc(User user, Accounts account) {

        if (usermap.containsKey(user)) {

            usermap.get(user).remove(account);

        } else {

            throw new UserNotFoundExeption("--------- User not found! ---------");
        }
    }


    /**
     * Метод вывода информации по Set Useram- по ключам
     * И внутрей форадж по Аккантам этого Юзера
     */

    public void showUserAccout() {

        for (User  userkey : usermap.keySet()) {

            System.out.println("Пользователь(Ключи): " + userkey);

            for (Accounts useraccount : usermap.get(userkey)) {

                System.out.println("Счета клиента: " + useraccount);
            }


        }
    }


    /**
     * Метод выводит все счета по ключу!
     * @param user
     * @return
     */

    public List<Accounts> getUserAccounts(User user) {

        if (usermap.containsKey(user)) {

            return usermap.get(user);


        } else {

            throw new UserNotFoundExeption("--------- User not found! ---------");
        }



    }

    public boolean transferMoney(User srcUser, Accounts srcAccount, User dstUser, Accounts dstAccount, double amount) {


        for (User  userkey : usermap.keySet()) {

            if (userkey.equals(srcUser)) {

                for (Accounts useraccount : usermap.get(userkey)) {

                    if (useraccount == srcAccount) {

                        double res = useraccount.getValue() - amount;


                       if (res < 0) {

                           return false;

                        } else {

                           srcAccount.setValue(srcAccount.getValue() - amount);
                       }


                    }
                }
            }

        }
        for (User  userkey2 : usermap.keySet()) {

            if (userkey2.equals(dstUser)) {

                for (Accounts useraccount : usermap.get(userkey2)) {

                    if (useraccount == dstAccount) {

                        dstAccount.setValue(dstAccount.getValue() + amount);

                    }
                }
            }

        } return true;


    }


    //- метод для перечисления денег с одного счёта на другой счёт:
    //если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.

    //Посмотрите на методы Map.putIfPresent putIfAbsent и list.indexOf, как их можно применить в этом задании.

}
