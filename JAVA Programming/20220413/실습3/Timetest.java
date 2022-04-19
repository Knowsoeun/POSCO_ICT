package prac;
import java.util.Scanner;
public class Timetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시,분,초를 입력받는다.
		int result;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("시, 분, 초"); //입력
		
		int hour=sc.nextInt();
		int min=sc.nextInt();
		int sec=sc.nextInt();
		
		Time first_time = new Time(10,10,10);
		Time second_time = new Time(hour, min, sec);
		
		Time add_time=first_time.add(second_time); // add 메소드 호출

		Time sub_time = first_time.sub(second_time); // sub 메소도 호출
		
		add_time.print(); // print 메소드 호출
		System.out.println();
		sub_time.print( ); // print 메소드 호출
		
		result = first_time.compare(second_time); // compare 메소드 호출
		System.out.println("\n"+result);
		
	}

}
