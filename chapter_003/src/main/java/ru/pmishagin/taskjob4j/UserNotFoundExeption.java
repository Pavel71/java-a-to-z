package ru.pmishagin.taskjob4j;

/**
 * Class UserNotFoundExeption
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.12.2017
 */
public class UserNotFoundExeption extends RuntimeException {


    public UserNotFoundExeption(String message) {


             super(message);

    }

}
