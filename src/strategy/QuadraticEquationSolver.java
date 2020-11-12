package strategy;

public class QuadraticEquationSolver {
    private final DiscriminantStrategy strategy;

    public QuadraticEquationSolver(DiscriminantStrategy strategy) {
        this.strategy = strategy;
    }

    public Pair<Complex, Complex> solve(double a, double b, double c) {
        double discriminant = strategy.calculateDiscriminant(a, b, c);
        Complex plus, minus;
        System.out.println(discriminant);
        if (Double.isNaN(discriminant)) {
            plus = new Complex(Double.NaN, Double.NaN);
            minus = new Complex(Double.NaN, Double.NaN);
        } else if (discriminant >= 0) {
            plus = new Complex((-b + Math.sqrt(discriminant)) / (2 * a), 0);
            minus = new Complex((-b - Math.sqrt(discriminant)) / (2 * a), 0);
        } else {
            plus = new Complex(-b / (2 * a), +Math.sqrt(-discriminant) / (2 * a));
            minus = new Complex(-b / (2 * a), -Math.sqrt(-discriminant) / (2 * a));
        }
        return new Pair<>(plus, minus);
    }
}
