package rally;

public class Road{

public static void main(String[] args){

	Car car = new Car();
	car.fill(100);
    car.showGas();

    Car mersedes = car;
    mersedes.drive(10);
    car.showGas();
    car.drive(10);
    car.showGas();
    Road.gasStation(car);
    car.showGas();
    
    } 
    
    public static void gasStation(Car car){
    	car.fill(100);
    }

    
}