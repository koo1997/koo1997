import org.omg.CORBA.PUBLIC_MEMBER;

public class tj16 {

	public static void main(String[] args) {
		
		String var1 = "신민철";
		String var2 = "신민철";
		
		if(var1==var2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		if(var1.equals(var2)) {
			System.out.println("같음");
		}
		String var3 = new String("신민철");
		String var4 = new String("신민철");
		if(var3==var4) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		if(var3.equals(var4)) {
			System.out.println("같음");
		}
		
		String[] name = {"홍길동","홍길순","강감찬"};
		int[] jumsu= {100,80,70};
		int tot=0;
//		double avg=0;
		for(int i = 0;i<3;i++) {
			System.out.println(name[i]+":"+jumsu[i]);
			tot+=jumsu[i];
		}
		double avg = (double)tot/3.0;
		System.out.println("총:"+tot);
		System.out.println("평:"+avg);
		
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1+=scores[i];
		}
		System.out.println("총합 :"+ sum1);
		int sum2 = add(new int[] {83,90,87});
		System.out.println("총2 :"+sum2);
		System.out.println();
		}
		public static int add(int[] scores) {
			int sum=0;
			for(int i=0;i<3;i++) {
				sum+=scores[i];
			}
			return sum;
		
		
	}

}
