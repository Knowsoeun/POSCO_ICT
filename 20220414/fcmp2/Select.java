package fcmp2;

public class Select extends Tr{

    public Select(String a, String b) {
        super(a, b);
    }

    private int subCheck(String s) {
        int dot = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-')
                continue;
            else if (Character.isDigit(s.charAt(i)))
                continue;
            else if (dot == 0 && s.charAt(i) == '.')
                dot = 1;
            else
                return 1;
        }
        return 0;
    }

    public Tr check() {
        if (subCheck(super.getA()) == 0 && subCheck(super.getB()) == 0)
            return new Numcmp(super.getA(), super.getB());
        else
            return new Strcmp(super.getA(), super.getB());
    }

    public int connect(Tr tr) {
        if (tr instanceof Strcmp) {
            return ((Strcmp) tr).cmp();
        } else {
            return ((Numcmp) tr).cmp();
        }
    }

}
