import java.util.Scanner; //Scanner 클래스 포함

public class Add{ //main 메소드에서 실행이 시작
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in); //사용자로부터 입력을 받기 위해서 Scanner 객체 생성
    
    int x; //변수선언( 목적: 첫 번째 숫자를 저장 )
    int y; //변수선언 ( 목적: 두 번째 숫자를 저장 )
    int sum; //변수선언( 목적: 합을 나타냄 )
    
    System.out.print("첫 번째 숫자를 입력하시오: "); //입력 안내 출력
    x = input.nextInt(); //첫 번째 정수형 숫자를 읽음
    
    System.out.print("두 번째 숫자를 입력하시오: "); //입력 안내 출력
    y = input.nextInt(); //두 번째 정수형 숫자를 읽음
    
    sum = x/y; //나눗셈을 출력 -> *실행 오류 발생*
    System.out.println(sum);
    System.out.println("나눈값 ="+x/y); //->*논리 오류 발생*
  } //메소드 끝
} //클래스 끝

//------------------------------------------------------------------
Q) 왜 논리오류가 발생할까?
  -논리오류는 컴파일 실행은 되지만 의도하지 않은 결과가 발생될 때 나타나는 오류이다.
  예를 들어, 3과 2를 차례로 입력했을 경우, 우리가 원하는 답은 3/2인 1.5이다.
  그러나 sum의 변수 타입이 int형(정수형)이므로 1이 출력된다.
  즉, 컴파일은 되지만 우리가 원하는 답과 다른 답이 출력되는 논리 오류가 발생하는 것이다.
