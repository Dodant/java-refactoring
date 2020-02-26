package IntroduceNullObject.step3;

public class NullLabel extends Label {
    public NullLabel() {
        super("(none)");
    }
    @Override public void display() {
    }
    @Override public boolean isNull() {
        return true;
    }
}
