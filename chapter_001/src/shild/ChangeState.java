public class ChangeState {

  public static class Claim {
  public String name;
  }

 public static void main(String[] args) { //метода main
 Claim claim = new Claim(); //Делаем ссылку с именем claim  и создаем объект claim(без значения)
 claim.name = "bug"; // Здесь мы придаем объекту claim значение bug
 processClaim(claim);
 System.out.println(claim.name);//Выводим на экран то что находится в объекте claim, тоесть bug
  }

  private static void processClaim(Claim value) {// в этом методе мы присваиваем ссылке Claim переменную value которой присваивается значение task!
  value.name = "task";
  }
}