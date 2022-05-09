
public class tj06 {

	public static void main(String[] args) {

		
		int v1 = 10;
		int v2 = ~v1;
		System.out.println(Integer.toBinaryString(v1));
		System.out.println(a(v1));
		System.out.println(Integer.toBinaryString(v2));
		System.out.println(a(v2));

		
		
	}
	
	
	public static String a(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			//str = "0" + str;
			str="@"+str;//while 반복문
		}
		return str;
	}

}
