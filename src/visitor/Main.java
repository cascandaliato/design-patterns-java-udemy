package visitor;

public class Main {
    public static void main(String[] args) {
        AdditionExpression simple = new AdditionExpression(new Value(2), new Value(3));
        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(simple);
        System.out.println("is " + ep + " equal to (2+3) ?");
    }
}
