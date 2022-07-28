package training.com.omar.Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car>{
	
	private String make;
	private int mileage;
	private int price;
	
	
	
	public Car(String make, int mileage, int price) {
		super();
		this.make = make;
		this.mileage = mileage;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "car [make=" + make + ", mileage=" + mileage + ", price=" + price + "]";
	}
	public int compareTo(Car o) {
		
		if (this.getPrice() > o.getPrice())
			return 1;
		else
			return -1;
		
		
	}
	
	
}

public class ComparableEx {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Toyota", 20000, 5000));
		cars.add(new Car("Nissan", 100000, 1500));
		cars.add(new Car("Honda", 50000, 3500));
		
		//Cars sorted ascending order by Price
		Collections.sort(cars);
		
		for (Car c : cars)
			System.out.println(c);
	}

}
