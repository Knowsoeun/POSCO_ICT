package prac3;
import java.util.Scanner;

public class Tr_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		class Select1 { 
			//필드 선언
				String s;
				String t;
			
				public Select1(String s, String t) {
					this.s=s;
					this.t=t;
					// TODO Auto-generated constructor stub
				}

				//check 메소드 - 두 문자열의 상태에 맞는 cmp 메소드를 가지는 객체를 리턴
				Tr check() {
				// 문자열이 모두 문자면 Strcmp 호출
				for (int i=0; i<s.length(); i++){
				 	if(Character.isDigit(s.charAt(i))==false && s.charAt(i)!='.' && s.charAt(i)!='-')
				 		return new Strcmp(s,t);
				 }
				for (int i=0; i<t.length(); i++){
				 	if(Character.isDigit(t.charAt(i))==false && t.charAt(i)!='.' && t.charAt(i)!='-')
				 		return new Strcmp(s,t);
				 }
				// 문자열이 숫자면 Numcmp호출
				return new Numcmp(s,t);

			}
				

			}
		
		Select1 P;
		Tr Q;
		
		P = new Select1(s,t);
		Q=P.check();
		

		System.out.println(Q.cmp());
		
		

		

	}

}
