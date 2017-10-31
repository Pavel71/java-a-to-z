package rally;

public class Car {
  
  private int gas = 0;

  public void drive(int value){

     this.gas =this.gas - value;
  }
  public void fill (int value) {
     this.gas = value;
  }
  public void showGas(){
  	System.out.println("Gas :" + gas);
  }


    /**
     * Created by Home on 26.10.2017.
     */
    public static class ArrayExample {
    }
}