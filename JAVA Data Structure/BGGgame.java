package dd;
import java.util.Scanner;

/*
2022-04-19
�����
*/

public class BGGgame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.: ");
		System.out.print("ö�� >> ");
		String a = s.next();
		System.out.print("���� >> ");
		String b = s.next();
		
		
		//ö���� ������ ���� ���
		if (a.equals("����")) {
			if (b.equals("����")) {
				System.out.print("���� �̰���ϴ�.");
			}
			else if (b.equals("��")){
				System.out.print("ö���� �̰���ϴ�.");
			}
		}
		
		//ö���� ���� ���� ���
		else if (a.equals("��")) {
			if (b.equals("����")) {
				System.out.print("ö���� �̰���ϴ�.");
			}
			else if (b.equals("����")){
				System.out.print("���� �̰���ϴ�.");
			}
		}
		
		//ö���� ������ ���� ���
		else if (a.equals("����")) {
			if (b.equals("����")) {
				System.out.print("���� �̰���ϴ�.");
			}
			else if (b.equals("��")){
				System.out.print("ö���� �̰���ϴ�.");
			}
		}
		
		//����� ���
		if (a.equals(b)) {
			System.out.print("�����ϴ�.");

	}

}}
