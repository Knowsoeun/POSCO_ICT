package prac2;

import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class Ts_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		double a,b; 
		int result;
		
		Ts P = new Ts(s,t);
		int cond = P.check(); // 두 문자열이 모두 문자인지, 숫자인지를 cond에 저장
		
		//문자열인 경우
		if(cond==Ts.STR) {  //Ts STR결과와 cond가 같으면=둘 다 문자열이면
			result = s.compareTo(t); //s와 t를 비교한다.
		}
		//숫자인 경우
		else {
			a = Double.parseDouble(s); //실수로 바꿔준다.
			b = Double.parseDouble(t); 
			
			if(a>b)
				result = 1;
			else if(a<b)
				result = -1;
			else
				result = 0;
		}
		System.out.println(result);
	}



}
