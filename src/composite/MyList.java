package composite;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {
  // please leave this constructor as-is
  public MyList(Collection<? extends ValueContainer> c) {
    super(c);
  }

  public int sum() {
    return this.stream().map(ValueContainer::sum).reduce(0, Integer::sum);
  }
}
