package prac;
import java.util.Scanner;
public class Timetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��,��,�ʸ� �Է¹޴´�.
		int result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("��, ��, ��"); //�Է�
		
		int hour=sc.nextInt();
		int min=sc.nextInt();
		int sec=sc.nextInt();
		
		Time first_time = new Time(10,10,10);
		Time second_time = new Time(hour, min, sec);
		
		Time add_time=first_time.add(second_time); // add �޼ҵ� ȣ��

		Time sub_time = first_time.sub(second_time); // sub �޼ҵ� ȣ��
		
		add_time.print(); // print �޼ҵ� ȣ��
		System.out.println();
		sub_time.print( ); // print �޼ҵ� ȣ��
		
		result = first_time.compare(second_time); // compare �޼ҵ� ȣ��
		System.out.println("\n"+result);
		
	}

}
