
public class tj20 {

	
	public static void main(String[] args) {
		
		String[] str = new String[3];
		str[0]="Java";
		str[1]="Java";
		str[2]=new String("Java");
		
		System.out.println(str[0]==str[1]);
		System.out.println(str[0]==str[2]);
		System.out.println(str[0].equals(str[2]));
		
		int[] old1= {1,2,3};
		int[] new1= new int[5];
		for (int i=0;i<old1.length;i++) {
			new1[i]=old1[i];
			
		}
		for (int i=0;i<new1.length;i++) {
			System.out.print(new1[i]+",");
		
		
		}
		
		String[] old= {"j","a","c"};
		String[] new2=new String[5];
		System.arraycopy(old,0,new2,0,old.length);
		for(int i=0; i<new2.length;i++) {
			System.out.println(new2[i]+",");
		}
		System.out.println( " ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] aa = new int[10];
		int[] bb = new int[10];
		System.out.println("aa배열");
		for(int i=0;i<aa.length;i++) {
			aa[i]=i+1;
		}
		for(int i=0;i<bb.length;i++) {
			bb[i]=aa[(aa.length-1)-i];
			
		}
		for(int i=0;i<aa.length;i++) {
		System.out.print(aa[i]+",");
		}		
		System.out.println();
		System.out.println("bb배열");
		for(int i=0;i<bb.length;i++) {
		System.out.print(bb[i]+",");
		}		
		System.out.println();
		
		int[] scores = {95,71,84,93,87,89};
		int sum =0;
		
		for(int score : scores) {
			sum= sum+score;
		}
		System.out.println("점수총합 = " +sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("점수 평균 = "+ avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
