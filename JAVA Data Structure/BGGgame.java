package dd;
import java.util.Scanner;

/*
2022-04-19
노소은
*/

public class BGGgame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.: ");
		System.out.print("철수 >> ");
		String a = s.next();
		System.out.print("영희 >> ");
		String b = s.next();
		
		
		//철수가 가위를 냈을 경우
		if (a.equals("가위")) {
			if (b.equals("바위")) {
				System.out.print("영희가 이겼습니다.");
			}
			else if (b.equals("보")){
				System.out.print("철수가 이겼습니다.");
			}
		}
		
		//철수가 보를 냈을 경우
		else if (a.equals("보")) {
			if (b.equals("바위")) {
				System.out.print("철수가 이겼습니다.");
			}
			else if (b.equals("가위")){
				System.out.print("영희가 이겼습니다.");
			}
		}
		
		//철수가 가위를 냈을 경우
		else if (a.equals("가위")) {
			if (b.equals("바위")) {
				System.out.print("영희가 이겼습니다.");
			}
			else if (b.equals("보")){
				System.out.print("철수가 이겼습니다.");
			}
		}
		
		//비겼을 경우
		if (a.equals(b)) {
			System.out.print("비겼습니다.");

	}

}}
