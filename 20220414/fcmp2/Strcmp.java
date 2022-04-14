package fcmp2;

public class Strcmp extends Tr{

    public Strcmp(String a, String b) {
        super(a, b);
    }

    public int cmp() {
        return super.getA().compareTo(super.getB());
    }

}
