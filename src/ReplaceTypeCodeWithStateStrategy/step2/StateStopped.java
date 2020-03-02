package ReplaceTypeCodeWithStateStrategy.step2;

public class StateStopped extends State {
    @Override public int getTypeCode() {
        return Logger.STATE_STOPPED;
    }
}
