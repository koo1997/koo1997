package tj00;

public class tj004 {

	public static void main(String[] args) {
		//Grade score = null;
		Grade C = Grade.C;
		int ordinal = C.ordinal();
		System.out.println(ordinal);
		
		
		
		
		
		
		
		Grade grade1 = Grade.A;
		
		Grade grade2 = Grade.F;
		
		int a = grade1.compareTo(grade2);
		int b = grade2.compareTo(grade1);
		System.out.println(a);
		System.out.println(b);
		
		if(args.length ==1) {
			String grade3 = args[0];
			Grade grade4 = Grade.valueOf(grade3);
			
			if(grade4 == Grade.A || grade4 == Grade.B) {
				System.out.println("우수한 성적");
			}else {
				System.out.println("일반 성적");
			}
		}
		Grade[] grades= Grade.values();
		for(Grade g : grades) 
			System.out.println(g);	
		
		
	}

}
