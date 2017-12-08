package ru.pmishagin.taskjob4j;

import java.util.*;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 06.12.2017
 */
public class StartTest {


    public static void main(String[] args) {



        Operation oper = new Operation();

        User user1 = new User("Pavel", 123987);

        User user2 = new User("Pankrat", 1234511);

        Accounts acc1 = new Accounts(2900);
        Accounts acc2 = new Accounts(3900);
        Accounts acc3 = new Accounts(5900);

        oper.addUser(user1);

        oper.addUser(user2);

        oper.addAccountToUser(user1, Arrays.asList(acc1, acc2));

        oper.addAccountToUser(user2, Arrays.asList(acc3));


        //boolean transfer = oper.transferMoney(user1, acc1, user2, acc3, 3000);

       // System.out.println(oper.getUserAccounts());

        //oper.showUserAccout();


        //oper.deleteAccountFromUser(user1,acc1);


        //oper.getUsermap().get(user1).remove(acc2);


       // oper.dellAcc(user1,acc2);



       // System.out.println(coll);


       // System.out.println(oper.getAcclist());

       // System.out.println(oper.findIndexAccount(acc3));



       //oper.deleteAccountFromUser(new User("Pankrat", 1234511), new Accounts(2000));




       // oper.getAcclist().remove(0);

        //oper.showUserAccout();

        //System.out.println(oper.getUserAccounts(new User("Pavel", 123987)));



     //  boolean trans = oper.transferMoney();

      // System.out.println(trans);

        //System.out.println(oper.getAcclist());

        //oper.showUserAccout();
        //new Operation().deleteUser(new User("Popani", 1212345));


        //System.out.println(oper.getuserlist());





     //oper.getUsermap().put(new User("Pavel", 1234505), Arrays.asList(oper.getUseracc().get(0),oper.getUseracc().get(1)));

        //oper.getUsermap().put(new User("Pankrat", 1213505), Arrays.asList(oper.getUseracc().get(2),oper.getUseracc().get(3)));

      //oper.showUserAccout();

     // oper.deleteAccountFromUser(oper.getUserlist().get(0), oper.getAcclist().get(0));





/*
Map<Person, List<? extends Pet>> personMap = new HashMap<>();

personMap.put(new Person("Иван"), Arrays.asList(new Cat("Барсик"), new Cat("Мурзик")));
personMap.put(new Person("Маша"), Arrays.asList(new Cat("Васька"), new Dog("Бобик")));
personMap.put(new Person("Ирина"), Arrays.asList(new Cat("Рыжик"), new Dog("Шарик"), new Parrot("Гоша")));

System.out.println("personMap: " + personMap);
System.out.println("personMap.keySet(): " + personMap.keySet());

for(Person person : personMap.keySet()){
    System.out.println(person + " имеет");
    for (Pet pet : personMap.get(person)){
        System.out.println("  " + pet);
    }
} */





    }
}
