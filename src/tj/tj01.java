package tj;

public class tj01 {

	public static void main(String[] args) {

//		int su1 = 100;
//		int su2 = 50;
//
//		int add = su1 + su2;
//		int sub = su1 - su2;
//		int gup = su1 * su2;
//		int div = su1 / su2;
//
//		System.out.println("덧셈 :" + add);
//		System.out.println("뺄셈 :" + sub);
//		System.out.println("곱셈 :" + gup);
//		System.out.println("나누기 :" + div);
//
//		System.out.println("안녕" + 1 + 2);
//		System.out.println("안녕" + (1 + 2));
//		System.out.println(1 + 2 + "안녕");

		
// 		int value = 90;
//		if(value >= 80) {
//			int value1 = 50;
//			System.out.println("크다");
//		}else {
//			System.out.println("작다");
//		}
		
		

//		이진수	
//		128 64 32 16 8 4 2 1
//		01111000=168 (250)8진수 (A8)16진수
//		01100000=192 (300)8진수 (C0)16진수
//		01110110=242 ()
//		10111001=185 (271)8진수  (B9)16진수
//		byte b = 127;
//				System.out.println(b);
//		10
//		00001010/11110101/11110110
//		00010100/11101011/11101100
		
//		byte a = 125;
//		int b = 125 ;
//		for(int i=0;i < 5;i++) {
//			a++;
//			b++;
//			System.out.println("a:"+a+"\t"+"b:"+b);
		
		
//		int sum=0;
//		for(int i=1;i <= 10;i++) {
//			sum=sum+i;
//			
//			System.out.println("합 :"+sum);
//					
//			}
//		
//		System.out.println("합 :"+sum);

//		char c1 = 'A';
//		char c2 = 65;
//		char c3 = '\u0041';
//		
//		char c4 = '가';
//		char c5 = 44032;
//		char c6 = '\uac00';
//		int uniCode = 'ㄱ';
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);
//		System.out.println(c5);
//		System.out.println(c6);
//		System.out.println(uniCode);

		
		
//		byte b = 1;
//		short c = 111 ;
//		int d = c+b;
//		
//		System.out.println(d+b+c);
				
		
//		int var1= 10;//10진수
//		int var2= 012;//8진수
//		int var3= 0xA;//16진수
//		
//		System.out.println(var1);
//		System.out.println(var2);
//		System.out.println(var3);
		
//		long a = 10;
//		long b = 1000000000;
//		long c = 10000000000000000L;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		
//		
//		double var1= 3.14;
//		float var2 = 3.4f;
//		
//		double var3 = 0.1234567890123456789;
//		float var4 = 0.1234567890123456789F;
//		System.out.println(var3);
//		System.out.println(var4);
//		
//		
//		int var6 = 3000000;
//		double var7 = 3e6;
//		float var8 = 3e6f;
//		double var9 = 2e-3;
//		System.out.println(var6);
//		System.out.println(var7);
//		System.out.println(var8);
//		System.out.println(var9);
//		
//		
//		boolean stop = false;
//		if(stop ) {
//			System.out.println("중지합니다.");
//			
//		}else {
//			System.out.println("시작합니다.");
//		}
		
		
//		String name = "홍길동";  
//		int kor = 80;
//		int eng = 80;
//		int mat = 80;
//		int tot = kor+eng+mat;
//		double avg= tot/3;
//		char grade;
//		
//		
//		
//		if(avg>60) {
//			grade= '합';
//			
//		}else {
//			grade = '불';
//			
//			
//		}
//		System.out.println("이름 :"+name);
//		System.out.println("평균 :"+avg);
//		System.out.println("합격여부 :"+ grade);
//		
////		int intValue = 200;
////		double doubleValue = intValue; 
////		System.out.println(intValue);
//		
//		
	
		
//		byte byteValue = 10;
//		int intValue = byteValue;
//		System.out.println(intValue);
		
		
//		char charValue = '가';
//		intValue = charValue;
//		System.out.println("가의유니코드="+intValue);
//		
		
				
//		int intValue = 103029770;
//		byte byteValue = (byte) intValue;
//		System.out.println(intValue);
		
		
//		int intValue='A';
//		char charValue=(char) intValue;
//		System.out.println(charValue);
//		
		
		
		
		
//		int i = 128;
//		
//		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {
//			System.out.println("byte 타입으로 변환할 수 없습니다.");
//			System.out.println("값을 다시 확인해 주세요");
//		} else {
//			byte b = (byte) i;
//			System.out.println(b);
//		}
		
		
		
//		String name = "홍길동";  
//		int kor = 80;
//		int eng = 80;
//		int mat = 80;
//		int tot = kor+eng+mat;
//		double avg= tot/3;
//		String grade;
//		
//		if((avg>=60) && (kor>=40) && (eng>=40) && (mat>=40)) {
//			grade = "합격";
//		}else {
//			grade = "불합격";
//		}
//		
//		System.out.println("합격여부 :"+grade);
		
		int a = 100;
		
		if((a>100) || (a<0)) {
			System.out.println("잘못된 점수입니다");
		}else {
			System.out.println(a);
		}
		
		
		

//		int kor = 100;
//		int eng = 100;
//		int mat = 200;
//		int tot = kor+eng+mat;
//		
//		
//		if((kor>100) ||(eng>100) ||(mat>100) || (kor<0) || (eng<0) || (mat<0)) {
//			System.out.println("잘못된 점수입니다");
//		}else {
//			System.out.println(tot);
//		}
		
		
		
		int kor = 100 ;
		int eng = 100;
		int mat = 100;
		int tot = kor+eng+mat;
		
		
		if((kor<=100) && (eng<=100) && (mat<=100) && (kor>=0) && (eng>=0) && (mat>=0)) {
			System.out.println(tot);
		}else {
			
			System.out.println("잘못된 점수입니다");
		}
		
		
		
		
		
		
	}

}
