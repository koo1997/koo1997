
public class tj22gugudan {

	public static void main(String[] args) {

//		int[][] eng = new int[2][];
//		eng[0] = new int[2];
//		eng[1]= new int[3];
//		for(int i = 0; i<eng.length;i++) {
//			for(int k =0; k<eng[i].length;k++) {
//				System.out.println("eng["+i+"]["+k+"]="+eng[i][k]);
//				
//			}
//		}
//		System.out.println();
		
		
		//2차배열
		int[][] a = new int[8][9];
		for(int i=0;i<a.length;i++) {
			System.out.println((i+2)+"단");
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = (i+2) * (j+1);
				System.out.println((i+2)+ "X"+ (j+1)+"="+a[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
