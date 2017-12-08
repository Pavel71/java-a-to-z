package ru.pmishagin.taskjob4j;

import org.junit.Test;

import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 08.12.2017
 */
public class OperationTest {

    @Test

    public void whenWeWantDeleteUser() {


        Operation oper = new Operation();


        oper.addUser(new User("Pavel", 123987));

        oper.deleteUser(new User("Pavel", 123987));

        assertThat(false, is(oper.getUsermap().containsKey(new User("Pavel", 123987))));


    }

    @Test

    public void addAccountToUser() {

        Operation oper = new Operation();

        oper.addUser(new User("Pankrat", 1234511));

        oper.addAccountToUser(new User("Pankrat", 1234511), Arrays.asList(new Accounts(2000), new Accounts(3000)));

        assertThat(oper.getUsermap().get(new User("Pankrat", 1234511)), is(oper.getUserAccounts(new User("Pankrat", 1234511))));


    }

    @Test

    public void dellAccountUser() {

        Operation oper = new Operation();

        User user1 = new User("Pankrat", 1234511);

        oper.addUser(user1);

        Accounts acc1 = new Accounts(2000);

        Accounts acc2 = new Accounts(3000);

        oper.addAccountToUser(user1, Arrays.asList(acc1, acc2));

        oper.deleteAccountFromUser(user1, acc1);

        assertThat(oper.getUsermap().get(user1), is(Arrays.asList(acc2)));

    }
    @Test

    public void smalDelAccountCode() {

        Operation oper = new Operation();

        oper.addUser(new User("Pankrat", 1234511));

        oper.addAccountToUser(new User("Pankrat", 1234511), Arrays.asList(new Accounts(2000), new Accounts(3000)));

        oper.dellAcc(new User("Pankrat", 1234511), new Accounts(3000));

        assertThat(oper.getUsermap().get(new User("Pankrat", 1234511)), is(oper.getUserAccounts(new User("Pankrat", 1234511))));
    }

    @Test

    public void transferMany() {

        Operation oper = new Operation();

        User user1 = new User("Pankrat", 1234511);

        oper.addUser(user1);

        Accounts acc1 = new Accounts(2000);

        Accounts acc2 = new Accounts(3000);

        oper.addAccountToUser(user1, Arrays.asList(acc1, acc2));


        User user2 = new User("Ermak", 1212399);

        oper.addUser(user2);

        Accounts acc3 = new Accounts(2000);

        oper.addAccountToUser(new User("Ermak", 1212399), Arrays.asList(acc3));

        boolean transfer = oper.transferMoney(user1, acc2, user2, acc3, 2000);

        assertThat(true, is(transfer));

    }


}
