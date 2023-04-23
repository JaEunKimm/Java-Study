package home;

import java.util.Scanner;

public class C_operator {
	public void method1() {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int num = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candy/num));
		System.out.println("남는 사탕 개수 : " + (candy%num));
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int classes = sc.nextInt();
		
		System.out.print("번호 : ");
		sc.nextLine();
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0); //?
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double s = sc.nextDouble();
		
		String gender2 = (gender == 'M')? "남" : "여";  
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade,classes,num,name,gender2,s);
		
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
	
		String age_result = (age <= 13) ? "어린이" :(age <= 19) ? "청소년" : "성인";
		
		System.out.println(age_result);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double mean = sum/3;
		
		String result = ((kor >= 40) && (eng >= 40) && (math >= 40) && (mean >= 60)) ? "합격" : "불합격";
		System.out.println(sum);
		System.out.println(mean);
		System.out.println(result);
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		String a = sc.nextLine();
		char check = a.charAt(7);
		
		String result = (check == '1' || check == '3')?"남자":"여자";
	
		System.out.println(result);
		
		
	}
	
	
	public static void main(String[] args) {
		C_operator op = new C_operator();
		//op.method5();
	
}

}
