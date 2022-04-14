package fcmp2;

public class Numcmp extends Tr{

    public Numcmp(String a, String b) {
        super(a, b);
    }

    public int cmp() {
        double a = Double.parseDouble(super.getA());
        double b = Double.parseDouble(super.getB());
        return (a > b) ? 1 : (a < b) ? -1 : 0;
    }

}
