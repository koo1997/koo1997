
public class tj09 {

	public static void main(String[] args) {

		
		
		int b1 = 10;
		
		
		
		String a1 = "신민철";
		String a2 = "신민철";
		String a3 = new String("신민철");
		
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1.equals(a3));
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
		
		
		System.out.println("45 & 25 =" + (45 & 25));
		System.out.println("45 | 25 =" + (45 | 25));
		System.out.println("45 ^ 25 =" + (45 ^ 25));
		System.out.println("~45 =" +(~45));
		
		
		System.out.println(4>>2);
		System.out.println(4<<2);
		System.out.println(4>>>3);
		
		
		int y = 50;
		char z = (y>90) ? 'A' :((y>80) ? 'B' : 'C');
		System.out.println(y + "점은 " + z + "등급입니다.");
		
		
		
		
		
		
		
	}

}
