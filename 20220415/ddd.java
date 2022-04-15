package prac4;

import java.util.Scanner;

public class ddd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		
		Select4 P = new Select4(s,t);
		
		System.out.println(P.check());
	}

}

class Select4 extends Tr{
	public Select4(String s, String t) {
		super(s,t);
	}
	public int check() {
		class Numcmp{
			public int cmp() {
				int result;
				double a = Double.parseDouble(s); //실수로 바꿔준다.
				double b = Double.parseDouble(t); 
				
				if(a>b)
					result = 1;
				else if(a<b)
					result = -1;
				else
					result = 0;
				return result;
			}
		}
		
		class Strcmp{
			public int cmp() {
				int result = s.compareTo(t);
				return result;
			}
		}
		
		Numcmp np = new Numcmp();
		Strcmp stp = new Strcmp();
		
		for (int i=0; i<t.length(); i++) {
			if((Character.isDigit(t.charAt(i)) == false)) {
				if((t.charAt(i)!='-')&&(t.charAt(i)!='.'))
					return stp.cmp();
			}
		
		for (int j=0; j<t.length(); j++) {
			if((Character.isDigit(t.charAt(j)) == false)) {
				if((t.charAt(j)!='-')&&(t.charAt(j)!='.'))
					return stp.cmp();
			}
		}
	}
	}}
