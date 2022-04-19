package fcmp2;

import java.util.Scanner;

public class Chkstr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        Tr P, Q;

        P = new Select(s, t);
        Q = ((Select)P).check();

        System.out.println(((Select)P).connect(Q));
    }
}
