package prac;

import java.util.Scanner;

public class prac_for_each {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("문자열\n문자"); //입력
		Scanner sc=new Scanner(System.in); 
		String s=sc.nextLine();
		char c=sc.next().charAt(0);
		// 문자열 0번째 문자를 char타입으로 변환해준다. (문자)
		
		// Sting s="abcabc"; char c='a'
	
		
		String result=revsqueeze(s,c);
		System.out.println(result);

	}
	
	/*for문*/
	public static String revsqueeze(String s,char c) {
		
		String ss=s;
		char cc=c;
		String s_result=""; //반환 문자열
		
		// 문자열 길이만큼 뒤에서부터 역순으로 c와 비교해서 c가 아니면 붙여준다.
		for (int i=0; i<ss.length(); i++) {  //문자열 길이만큼 반복
			if (s.charAt(s.length()-i-1)!=c) {  //뒤에서부터 문자를 하나하나 c와 비교해서 같지 않으면
				s_result=s_result.concat(Character.toString(s.charAt(s.length()-i-1))); //반환 문자열에 해당 문자를 붙여준다.
			}
		}
		return s_result;
	}
	
	/*for-each문*/
	public static String revsqueeze(char [] s,char c) {
		String s_result="";
		
		for (char a:s) {
			if(a==c) {
				continue;
			}
			else {
				s_result=s_result+a;
			}
		}
		StringBuffer aa= new StringBuffer(s_result);
		s_result=aa.reverse().toString();
		
		return s_result;
	}
}