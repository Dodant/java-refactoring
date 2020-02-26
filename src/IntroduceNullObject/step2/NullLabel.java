package IntroduceNullObject.step2;

public class NullLabel extends Label {
    public NullLabel() {
        super("(none)");
    }
    @Override public boolean isNull() {
        return true;
    }
}
