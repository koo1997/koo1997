package tj4;

import java.util.Scanner;

public class Sung02Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] name=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] mat=new int[3];
		int[] tot=new int[3];
		double[] avg=new double[3];
		String[] grade=new String[3];
		String id ;String pw;
		int sum;
		while(true) {
		System.out.println("메뉴 :1. 점수 입력 2. 점수출력 3. 합격여부 4. 아이디 체크 5. 종료");
		sum=sc.nextInt();
		
		
		
		
		
		if(sum==1) {
			for(int i=0;i<3;i++) {
				System.out.println("이름 :");
				name[i]=sc.next();
				System.out.println("국어 :");
				kor[i]=sc.nextInt();
				System.out.println("영어 :");
				eng[i]=sc.nextInt();
				System.out.println("수학 :");
				mat[i]=sc.nextInt();
				Sung02 sung=new Sung02(name[i],kor[i],eng[i],mat[i]);
				tot[i]=sung.getTot();
				avg[i]=sung.getavg();
				grade[i]=sung.getGrade();
				}
			
		}else if(sum==2){
			for(int i=0;i<3;i++) {
			System.out.println("이름 :" + name[i]);
			System.out.println("국어점수 : " + kor[i]);
			System.out.println("영어점수 : " + eng[i]);
			System.out.println("수학점수 :" + mat[i]);
			}
		}else if(sum==3) {
			for(int i=0;i<3;i++) {
				System.out.println("이름 :" + name[i]);
				System.out.println("총점 :" + tot[i]);
				System.out.println("평균 : " + avg[i]);
				System.out.println("여부 : " + grade[i]);
			}
		}else if(sum==4) {
		System.out.println("id:");
		id=sc.next();
		System.out.println("pw:");
		pw=sc.next();
		Sung02 sung = new Sung02(id, pw);
		
		sung.getIdCheck();
		}else {
			System.out.println("종료");
			break;
		}
		}
	}
	
		
		
	}


