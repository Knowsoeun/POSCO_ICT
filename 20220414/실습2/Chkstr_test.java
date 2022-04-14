package prac2;
import java.util.Scanner;

public class Chkstr_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Tr P,Q;
		
		P = new Select(s,t);
		Q=((Select)P).check();
		
		System.out.println( ((Select)P).connect(Q));
	}

}
