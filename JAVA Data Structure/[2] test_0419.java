// for문 -> switch문으로 변경
package dd;
import java.util.Scanner;

public class switch_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		
		int score = scanner.nextInt();
		score = (score * 10)/100;
		char grade;
		
		//switch문
		switch(score){
		case 10: case 9:
			grade='A';
			break;
		case 8:
			grade='B';
			break;
		case 7:
			grade ='C';
			break;
		case 6:
			grade ='D';
			break;
		default:
			grade ='F';
			break;
		}
		
		System.out.println("학점은 "+ grade +"입니다.");
		
	}

}
