package dd;
import java.util.Scanner;

/*
2022-04-19
�����
*/

public class test_0419 {
	public static void main(String[] args) {
		/*
		���� �ݾ��� 56450 �Է�.
		5����, ����, 5õ��, õ��, 500��, 100��, 50�� ��ȯ ��� 
		 */
		Scanner sc=new Scanner(System.in); 
		System.out.println("�ݾ��� �Է��ϼ���: "); //�Է�
		int sum=sc.nextInt();
		
		int _5man, _man, _5chun, chun, _500, _100, _50;
		_5man = sum/50000;
		_man = (sum%50000)/10000;
		_5chun = ((sum%50000)%10000)/5000;
		chun = (((sum%50000)%10000)%1000)/1000;
		_500 = ((((sum%50000)%10000)%1000)%1000)/500;
		_100 = (((((sum%50000)%10000)%1000)%1000)%500)/100;
		_50 = ((((((sum%50000)%10000)%1000)%1000)%500)%100)/50;
		
		
		System.out.println("������ " + _5man +"��");
		System.out.println("���� " + _man +"��");
		System.out.println("��õ�� " + _5chun +"��");
		System.out.println("õ�� " + chun +"��");
		System.out.println("����� " + _500 +"��");
		System.out.println("��� " + _100 +"��");
		System.out.println("���ʿ� " + _50 +"��");
		

	}

}
