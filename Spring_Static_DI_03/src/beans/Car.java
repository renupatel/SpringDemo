package beans;

public class Car {
	
	public static String CarName;
	
	public static void setCarName(String Car){
		
		CarName = Car;
	}

	public void printCarName(){
		
		System.out.println("car Name =" + CarName);
	}
	
	// it will return the car object and spring IOc will make it as singleton
	
	public  Car getInstance() throws Exception{
		
		Car c = (Car) Class.forName(CarName).newInstance();
		return c;
		
	}
}
