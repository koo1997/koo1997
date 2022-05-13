import java.util.Scanner;
public class tj17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] tot=new int[3];
		int[] avg=new int[3];
//		int tot=0;
//		int avg=0;
//		boolean[] a = new boolean[3];
		for(int i=0;i<2;i++) {
//			System.out.println(name[i]);
//			System.out.println(kor[i]);
//			System.out.println(eng[i]);
//			System.out.println(a[i]);
//		}
//			System.out.println("이름 :");
			name[i] = sc.next();
			System.out.println("수학 :");
			kor[i] = sc.nextInt();
			System.out.println("영어 :");
			eng[i] = sc.nextInt();
			tot[i]=kor[i]+eng[i];
			avg[i]=tot[i]/2;
		}for(int i = 0;i<3;i++) {
			
			System.out.println("이름\t국어\t영어\t총점\t평균");
			System.out.println(name[i]+"\t"+  kor[i]+"\t"+ eng[i]+"\t"+tot[i]+"\t"+avg[i]);
		}
//			System.out.println(kor.length+","+eng.length+","+a.length);
		
		
		
		
		
	}

}
