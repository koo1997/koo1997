package tj3;

public class CarEx {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		Car mycar2= new Car("검정",3000);
		
		System.out.println(mycar2.color);
		System.out.println(mycar2.cc);
		System.out.println(mycar.color);
		System.out.println(mycar.cc);
		
		
		Car k1 = new Car("박자바","123456789");
		System.out.println("k1.name :"+k1.name);
		System.out.println("k1.ssn :"+k1.ssn);
		
		Car k2 = new Car("김자바","98745789");
		
		System.out.println("k2.name :"+k2.name);
		System.out.println("k2.ssn :"+k2.ssn);
		mycar2.plint();
	}

}
