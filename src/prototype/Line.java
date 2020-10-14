package prototype;

public class Line {
  public Point start, end;

  public Line(Point start, Point end) {
    this.start = start;
    this.end = end;
  }

  @Override
  public String toString() {
    return "Line{" + "start=" + start + ", end=" + end + '}';
  }

  public Line deepCopy() {
    return new Line(start.deepCopy(), end.deepCopy());
  }
}
