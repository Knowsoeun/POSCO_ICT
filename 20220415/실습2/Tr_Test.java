package prac4;
import java.util.Scanner;


public class Tr_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		
		Tr P;
		Ti Q;
		
		P = new Select2(s,t);
		Q=((Select2)P).check();
		
		
		System.out.println(Q.cmp());
		
	}

}
