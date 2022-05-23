package tj05;

public class SingEx {

	public static void main(String[] args) {

		Sing ob1 = Sing.get();
		Sing ob2 = Sing.get();
//		Sing ob1= new Sing();
//		Sing ob2= new Sing();
		System.out.println(ob1.eng);
		
		if(ob1==ob2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
	}

}
