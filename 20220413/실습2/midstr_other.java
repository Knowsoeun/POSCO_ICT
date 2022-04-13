package prac;
import java.util.Scanner;
public class midstr_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열\na번째\n개수"); //입력
		Scanner sc=new Scanner(System.in); 
		
		//가변매개변수는 같은 타입
		String s=sc.next();
		String a=sc.next();
		String b=sc.next();
		
		
		String result=midstr(s,a,b); // 함수 호출해서 result에.
		System.out.println(result);
	}
	
	//가변 : 메소드로 전달될 인수의 정확한 개수를 알 수 없을 때 사용된다.
	public static String midstr(String...strs) {  //strs에 s,a,b인수를 배열로 하나씩 넣는다.
		int a=Integer.parseInt(strs[1]); //parseInt() : String타입의 숫자를 int타입으로 변환
		int b=Integer.parseInt(strs[2]);
		
		//원본 문자열 최대 인덱스보다 큰 시작 인덱스를 주면 오류
		if(a>strs[0].length()) {      
			System.err.println("a 오류");
			System.exit(1);
		}
		
		//원본 문자열 마지막 인덱스보다 보다 끝 인덱스가 크면 오류
		if(a+b>strs[0].length()+1) {  
			System.err.println("b 오류");
			System.exit(1);
		}
		
		//a-b번째 해당되는 문자열 반환
		return strs[0].substring(a-1, a+b-1); 
	}

}
