package prac2;

//부모 클래스 Tr
class Tr { //두 문자열과 두 문자열의 상태 정보를 가진다.

	//필드 선언
	String s;
	String t;
	
	//생성자 정의
	public Tr(String s, String t) {
		this.s=s;
		this.t=t;

	}
}



//자식 클래스 Strcmp
class Strcmp extends Tr{  //두 문자열을 문자로 비교한다.
	public Strcmp(String s, String t) {
		super(s, t);  //부모 클래스의 기본 생성자 사용
	}
	
	//cmp메소드: 문자를 비교하는 함수
	public int cmp() {
		return s.compareTo(t);	
	}
}


//자식 클래스 Numcmp
class Numcmp extends Tr{ 
	// 생성자 메소드
	public Numcmp(String s, String t) {
			super(s, t);  //부모 클래스의 기본 생성자 사용/초기화
		}
	
	//cmp 메소드: 실수로 변환하여 비교하는 함수
	int cmp() {
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
class Select extends Tr{ 
	// 생성자 메소드
	public Select(String s, String t) {
			super(s, t);  //부모 클래스의 기본 생성자 사용
		}
	
	//check 메소드 - 두 문자열의 상태에 맞는 cmp 메소드를 가지는 객체를 리턴
	public Tr check() {
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
		return new Numcmp(s,t); //객체 return할 때는 new를 앞에 쓴다.

	}
	
	//connect 메소드 - 매개 변수로 받은 객체의 cmp 메소드 실행한 결과를 리턴
	public int connect(Tr Q) { //매개변수가 부모클래스인 Tr 데이터 타입으로 들어온다. 그러나 그게 Strcmp인지 Numcmp인지는 모르는 상태->그래서 if문으로 구별한다.
		if(Q instanceof Strcmp) //Strcmp이면 
			return ((Strcmp)Q).cmp();  //Q를 Strcmp로 다운캐스팅해주고 Strcmp의 cmp를 쓴다.
		else  //Numcmp이면
			return ((Numcmp)Q).cmp(); //Q를 Numcmp로 다운캐스팅해주고 Numcmp의 cmp를 쓴다.
	}
		

	}

// 부모->자식: 업캐스팅 why? 자식 클래스가 부모 클래스가 항상 더 크므로
// 자식->부모: 
