package ru.pmishagin.multithreading.userstoreage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Mishagin (mailto:raz_3@mail.ru)
 * @version 0.1
 * @since 04.01.2018
 */
public class UserStoreage {

  private final List<User> listuser = new ArrayList<>();

  public List<User> getListuser() {

      return this.listuser;
  }


  public boolean add(User user) {

      this.listuser.add(user);

      return true;
  }

  public boolean update(User user) {

      for (User elem : listuser) {

          if (elem.getId() == user.getId()) {

              elem.setAmount(user.getAmount());

              return true;
          }
      } return false;
  }

  public boolean delete(User user) {

      for (User elem : listuser) {

          if (elem.equals(user)) {

              listuser.remove(elem);
              return true;
          }
      } return false;

  }

  public boolean transfer(int fromid, int toid, int amount) {

      for (User elem : listuser) {

          if (elem.getId() == fromid) {

              int result = elem.getAmount() - amount;

              if (result > 0) {

                  elem.setAmount(result);

              } else {

                  break;
              }
          }

          if (elem.getId() == toid) {

              elem.setAmount(elem.getAmount() + amount);

              return true;

          }

      } return false;
  }

}
