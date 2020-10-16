package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {
    SingleValue singleValue = new SingleValue(42);

    ManyValues manyValues = new ManyValues();
    manyValues.add(1);
    manyValues.add(2);
    manyValues.add(3);

    Collection<ValueContainer> list = new ArrayList<>();
    list.add(singleValue);
    list.add(manyValues);

    System.out.println(new MyList(list).sum());
  }
}
