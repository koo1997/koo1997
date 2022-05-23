package tj4;

public class ComEx {

	public static void main(String[] args) {
		Com my = new Com();
		int[] val1= {1,2,3};
		int res1 = my.sum1(val1);
		System.out.println("res:" + res1);
		
		int res2 = my.sum1(new int[] {1,2,3,4,5});
		System.out.println("res2: " +res2);
		
		
	}

}
