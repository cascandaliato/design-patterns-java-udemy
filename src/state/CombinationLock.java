package state;

public class CombinationLock {
    private final int[] combination;
    public String status = "LOCKED";
    private int position = 0;

    public CombinationLock(int[] combination) {
        this.combination = combination;
    }

    public void enterDigit(int digit) {
        switch (status) {
            case "ERROR":
            case "OPEN":
                break;
            default:
                if (digit == combination[position]) {
                    if (position == 0) status = "";
                    status += combination[position];
                    if (++position == combination.length) status = "OPEN";
                } else {
                    status = "ERROR";
                }
                break;
        }
    }
}