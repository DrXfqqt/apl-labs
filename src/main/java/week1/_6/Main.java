public class Main {
    public static void main(String[] args) {
        int a, b, c, d, e, f, z=8;
        a = z++ + ++z;
        b = z-- + --z;
        c = z++;
        d = ++z;
        e = z--;
        f = --z;

        System.out.println("a = "+a+", b = "+b+", c = "+c+", d = "+d+", e = "+e+", f = "+f+", z = "+z);
    }
}
