package IntroduceAssertion.delete;

public class Main {
    private static final boolean ASSERT = false; // 어서션을 삭제하려면 false

    public static void main(String[] args) {
        int x = -123;
        if (ASSERT) {
            assert x > 0;
        }
    }
}
