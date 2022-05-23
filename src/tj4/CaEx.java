package tj4;

public class CaEx {

	public static void main(String[] args) {
		
		Pa pa = new Ca();
		pa.f1="ddd";
		pa.m1();
		pa.m2();
		Ca ca=(Ca) pa;
		ca.m3();
		ca.f2="ddfg";
		
		
	}

}
