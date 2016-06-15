package beans;

public class Subaru implements CarFactory{

	@Override
	public void drive() {
		System.out.println("drive Subaru 150 KMPL");
		
	}

}
