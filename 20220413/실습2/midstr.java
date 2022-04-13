package prac;

import java.util.Scanner;

public class midstr {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("문자열\na번째\n개수"); //입력
		Scanner sc=new Scanner(System.in); 
		String s=sc.nextLine();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		//char c=sc.next().charAt(0);
		// 문자열 0번째 문자를 char타입으로 변환해준다. (문자)
		
		// Sting s="abcabc"; char c='a'
	
		//try{}catch{}System.out.println("프로그램 종료!!"); //예외처리-프로그램 종료
		String result=midstr(s,a,b);
		System.out.println(result);

	}
	
	public static String midstr(String s, int a, int b) {
		
		String ss=s;
		String s_result=""; //반환 문자열
		
		
		for (int i=a-1; i<a+b-1; i++) {  
			s_result=s_result.concat(Character.toString(s.charAt(i))); //반환 문자열에 해당 문자를 붙여준다.
			
		} 
		return s_result;
	}
}


/*
 
 
 
*/