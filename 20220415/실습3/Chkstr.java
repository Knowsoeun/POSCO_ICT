package prac4;
import java.util.Scanner;

//메인 클래스
public class Chkstr{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Tr1 P;
		Object Q;
		P = new Select(s,t);
		Q = ((Select)P).check();
		
		if (Q instanceof Select.Numcmp)
			System.out.println(((Select.Numcmp)Q).cmp()); //Select 내부 클래스 Numcmp 안에 있는 cmp함수
		else
			System.out.println(((Select.Strcmp)Q).cmp());
	}
}

//부모 클래스 Tr1
class Tr1{
	public String s,t;
	
	public Tr1(String s, String t) {
		this.s=s;
		this.t=t;
	}
}

//Tr1의 자식 클래스 Select
class Select extends Tr1{
	public Select(String s, String t) {
		super(s,t);
	}
	
	// Select의 내부 클래스 Strcmp메소드
	class Strcmp{
		public int cmp() {
			int result;
			result=s.compareTo(t);
			return result;
		}
	}
	
	// Select의 내부 클래스 Numcmp메소드
	class Numcmp{
		public int cmp() {
			int result;
			double a = Double.parseDouble(s); //실수로 바꿔준다.
			double b = Double.parseDouble(t); 
			
			if(a>b)
				result = 1;
			else if(a<b)
				result = -1;
			else
				result = 0;
			return result;
		}
	}
	
	// Select의 내부 클래스인 Check메소드
	public Object check() {
		// 문자열이 모두 문자면 Strcmp 호출
		for (int i=0; i<s.length(); i++){
		 	if(Character.isDigit(s.charAt(i))==false && s.charAt(i)!='.' && s.charAt(i)!='-')
		 		return new Strcmp();
		 }
		for (int i=0; i<t.length(); i++){
		 	if(Character.isDigit(t.charAt(i))==false && t.charAt(i)!='.' && t.charAt(i)!='-')
		 		return new Strcmp();
		 }
		// 문자열이 숫자면 Numcmp호출
		return new Numcmp();
		}
	}
	
	
