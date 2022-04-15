package prac4;
import java.util.Scanner;


public class Tr_Test {

	public static void main(String[] args) {
		// 문장 2개를 입력받는다.
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		
		Tr P;
		Ti Q;
		
		P = new Select2(s,t);
		Q=((Select2)P).check(); //Q는 부모 인터페이스 Ti-> Select2 자식 클래스로 캐스팅 뒤 체크함수에 s,t를 적용한 P
		
		
		System.out.println(Q.cmp()); //cmp함수 결과 출력
		
	}

}
