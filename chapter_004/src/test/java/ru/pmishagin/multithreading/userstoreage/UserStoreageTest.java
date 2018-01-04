package ru.pmishagin.multithreading.userstoreage;

import org.junit.Test;

import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.01.2018
 */
public class UserStoreageTest {

    @Test

    public void whenUserAdd() {

        UserStoreage userstore = new UserStoreage();

        User user1 = new User(1, 1000);
        User user2 = new User(2, 2000);

        userstore.add(user1);
        userstore.add(user2);

        assertThat(user2, is(userstore.getListuser().get(1)));

    }

    @Test

    public void whenUserUpdate() {

        UserStoreage userstore = new UserStoreage();

        User user1 = new User(1, 1000);
        User user2 = new User(2, 2000);

        User user3 = new User(1, 2500);

        userstore.add(user1);
        userstore.add(user2);

        userstore.update(user3);

        assertThat(user3.getAmount(), is(userstore.getListuser().get(0).getAmount()));

    }

    @Test

    public void whenUserDell() {

        UserStoreage userstore = new UserStoreage();

        User user1 = new User(1, 1000);

        userstore.add(user1);

        userstore.delete(user1);

        assertThat(true, is(userstore.getListuser().isEmpty()));

    }

    @Test

    public void whenTransferAmount() {

        UserStoreage userstore = new UserStoreage();

        User user1 = new User(1, 1000);
        User user2 = new User(2, 2000);

        userstore.add(user1);
        userstore.add(user2);

        userstore.transfer(user1.getId(), user2.getId(), 500);

        assertThat(2500, is(user2.getAmount()));

    }

}