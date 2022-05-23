package tj4;

public class Static1 {
	
	
	int f1;
	void met() {};
	
	
	static int f2;
	static void met2() {};
	
	
	static {
//		f1=10;
//		met();
		f2=10;
		met2();
	}
	
	static void met3() {
		Static1 st1 = new Static1();
		st1.f1 = 1;
		st1.met();
		
		f2=10;
		met2();
	}

}
