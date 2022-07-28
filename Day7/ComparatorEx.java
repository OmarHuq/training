package training.com.omar.Day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Car2 {
	
	private String make;
	private int mileage;
	private int price;
	
	
	
	public Car2(String make, int mileage, int price) {
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
		return "Car2 [make=" + make + ", mileage=" + mileage + ", price=" + price + "]";
	}
	
	
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		
		
		List<Car2> cars = new ArrayList<Car2>();
		cars.add(new Car2("Toyota", 20000, 5000));
		cars.add(new Car2("Nissan", 100000, 1500));
		cars.add(new Car2("Honda", 50000, 3500));
		
		Comparator<Car2> com = new Comparator<Car2>()
				{
					public int compare(Car2 c1, Car2 c2) {
						
						if (c1.getMileage() > c2.getMileage())
							return 1;
						else
							return -1;
					}
				};
		
		
		
		//Cars sorted ascending order by Mileage using comparator
		Collections.sort(cars, com);
		
		for (Car2 c : cars)
			System.out.println(c);

	}

}
