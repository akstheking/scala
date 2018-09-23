package example;

/**
 * Created by siakhil on 6/23/17.
 */
public class JavaTest {

    protected int x;

    public JavaTest() {}

    public JavaTest(int x) {}


}

class VarTest extends JavaTest {

    private int y;

    public VarTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ":" + y;
    }

    public static void main(String[] args) {
        System.out.println(new JavaTest());
    }
}

