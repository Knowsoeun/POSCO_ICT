package dd;
import java.util.Scanner;
/*
2022-04-19
�����
*/

public class switch_test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		
		int score = scanner.nextInt();
		score = (score * 10)/100;
		char grade;
		
		//switch��
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
		
		System.out.println("������ "+ grade +"�Դϴ�.");
		
		

	}

}
