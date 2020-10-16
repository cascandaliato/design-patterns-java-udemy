package composite;

public interface ValueContainer extends Iterable<Integer> {

  default int sum() {
    int sum = 0;
    for (Integer value : this) {
      sum += value;
    }
    return sum;
  }
}
