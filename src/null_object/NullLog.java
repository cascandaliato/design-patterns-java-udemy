package null_object;

public class NullLog implements Log {
    private int recordCount;

    @Override
    public int getRecordLimit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getRecordCount() {
        return recordCount;
    }

    @Override
    public void logInfo(String message) {
        recordCount++;
    }
}