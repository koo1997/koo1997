package tj4;

public class CheckExample {
	public static void main(String[] args) {
		
		Check pa=new Check("admin","1111");
		
		Check pa2=new IdCheck01("admin","1234");
		pa.id(pa);
		pa2.id(pa2);
		
	}
	

}
