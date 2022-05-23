package tj4;

public class SungjukEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sungjuk2 sung=new Sungjuk2(10,100,80,"admin","1111");
		
		sung.tot();
		double result=sung.avg();
		System.out.println("평균 : " + result);
		sung.grade();
		sung.idCheck();
	}

}
