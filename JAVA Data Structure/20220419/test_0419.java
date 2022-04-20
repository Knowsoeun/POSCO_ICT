package dd;
import java.util.Scanner;

/*
2022-04-19
노소은
*/

//연산자 활용해서 잔돈 계산 
public class test_0419 {
	public static void main(String[] args) {
		/*
		돈의 금액을 56450 입력.
		5만원, 만원, 5천원, 천원, 500원, 100원, 50원 변환 출력 
		 */
		Scanner sc=new Scanner(System.in); 
		System.out.println("금액을 입력하세요: "); //입력
		int sum=sc.nextInt();
		
		int _5man, _man, _5chun, chun, _500, _100, _50;
		_5man = sum/50000;
		_man = (sum%50000)/10000;
		_5chun = ((sum%50000)%10000)/5000;
		chun = (((sum%50000)%10000)%1000)/1000;
		_500 = ((((sum%50000)%10000)%1000)%1000)/500;
		_100 = (((((sum%50000)%10000)%1000)%1000)%500)/100;
		_50 = ((((((sum%50000)%10000)%1000)%1000)%500)%100)/50;
		
		
		System.out.println("오만원 " + _5man +"장");
		System.out.println("만원 " + _man +"장");
		System.out.println("오천원 " + _5chun +"장");
		System.out.println("천원 " + chun +"장");
		System.out.println("오백원 " + _500 +"개");
		System.out.println("백원 " + _100 +"개");
		System.out.println("오십원 " + _50 +"개");
		

	}

}
