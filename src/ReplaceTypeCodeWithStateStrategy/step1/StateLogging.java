package ReplaceTypeCodeWithStateStrategy.step1;

public class StateLogging extends State {
    @Override public int getTypeCode() {
        return Logger.STATE_LOGGING;
    }
}
