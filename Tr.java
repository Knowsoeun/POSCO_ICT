package prac4;
import prac4.Tr;

//부모 클래스 Tr
abstract class Tr { //두 문자열과 두 문자열의 상태 정보를 가진다.

	//필드 선언
	String s;
	String t;
	
	//생성자 정의
	public Tr(String s, String t) {
		this.s=s;
		this.t=t;

	}
}

//부모 추상 인터페이스
interface Ti { 

	int cmp(); //추상 메소드 생성


}


//Ti인터페이스와 Tr 클래스를 상속받은 자식 클래스 Strcmp
class Strcmp extends Tr implements Ti{  //두 문자열을 문자로 비교한다.
	
	public Strcmp(String s, String t) {
		super(s, t);
		// TODO Auto-generated constructor stub
	}

	//cmp메소드: 문자를 비교하는 함수
	@Override
	public int cmp() {
		return s.compareTo(t);	
	}
}

//Ti인터페이스와 Tr 클래스를 상속받은 자식 클래스 Numcmp
class Numcmp extends Tr implements Ti{ 
	
	
	public Numcmp(String s, String t) {
		super(s, t);
		// TODO Auto-generated constructor stub
	}

	//cmp 메소드: 실수로 변환하여 비교하는 함수
	@Override
	public int cmp() {
		double a = Double.parseDouble(s); //실수로 바꿔준다.
		double b = Double.parseDouble(t); 
		int result;
		
		if(a>b)
			result = 1;
		else if(a<b)
			result = -1;
		else
			result = 0;
		return result;
	}
}

//자식 클래스 Select
class Select2 extends Tr{ 
	// 생성자 메소드
	public Select2(String s, String t) {
			super(s, t);  //부모 클래스의 기본 생성자 사용
		}
	
	//check 메소드 - 두 문자열의 상태에 맞는 cmp 메소드를 가지는 객체를 리턴
	public Ti check() {
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
	
	//connect 메소드 - 매개 변수로 받은 객체의 cmp 메소드 실행한 결과를 리턴
	public int connect(Tr Q) {
		if(Q instanceof Strcmp)
			return ((Strcmp)Q).cmp(); 
		else
			return ((Numcmp)Q).cmp();
	}
		

	}


