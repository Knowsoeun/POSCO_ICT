package main;

import java.util.Scanner;

import cls.InsertClass;

public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// menu 추가(insert), 삭제(delete), 검색(select), 수정(update)
		while(true) {
			System.out.println(">>>>>>>>>>>>> meue");
			System.out.println("1. 학생추가");
			System.out.println("2. 학생삭제");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생수정");
			System.out.println("5. 종료");
			
			System.out.print("작업번호 >> ");
			int number = s.nextInt();
			
			switch (number) {
				case 1:
					InsertClass ic = new InsertClass();	
					ic.process();
					break;
				case 2: 
					break;
				case 3: 
					break;
				case 4: 
					break;
				case 5:
					System.exit(0);
					break;
			}			
		}
		
	}
}
