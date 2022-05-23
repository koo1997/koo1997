package tj4;

public class DriEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus= new Bus();
		Taxi taxi = new Taxi();
		Dri dri = new Dri();
		Car01 car = new Car01();
		
		bus.run();
		taxi.run();
		System.out.println(taxi.name);
		dri.dri(bus);
		dri.dri(taxi);
		bus.run();
		car.run();
		Car01 car2 = bus;
		car2.run();
	}

}
