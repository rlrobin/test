package ugh;

public class Instance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car("Toyota",1500,1992);
		
		System.out.println(car1.carBrand);
		
		Car car2= new Car("Auti",57800,2018);
		
		System.out.println(car2.carBrand);
		
		car2.carBrand="Ford";
		
		System.out.println(car2.carBrand);
		
	}

}
