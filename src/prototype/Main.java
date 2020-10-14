package prototype;

public class Main {

  public static void main(String[] args) {
    Line line1 = new Line(new Point(0, 0), new Point(1, 1));
    Line line2 = line1.deepCopy();
    line2.end.x = 42;
    System.out.println(line1);
    System.out.println(line2);
  }
}
