package tj4;

public class Perosn {
	
	static double tax=0.03;
	static int salary;
	static int gettax() {
		
		return (int)(salary*tax);
	}
	
	static int gettax2() {
		return (int)((salary*tax)*0.1);
	}
	
	static void tax() {
		int a = gettax();
		int b = gettax2();
		System.out.println("소득세:"+a+"원");
		System.out.println("지방세:"+b+"원");
		System.out.println("총세금:"+(a+b)+"원");
		System.out.println("월급:"+salary+"원");
	}

}
