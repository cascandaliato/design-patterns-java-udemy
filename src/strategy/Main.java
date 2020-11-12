package strategy;

public class Main {
    public static void main(String[] args) {
        QuadraticEquationSolver ordinarySolver = new QuadraticEquationSolver(new OrdinaryDiscriminantStrategy());
        System.out.println(ordinarySolver.solve(4, 3, 2));
        System.out.println(ordinarySolver.solve(4, 9, 2));

        QuadraticEquationSolver realResolver = new QuadraticEquationSolver(new RealDiscriminantStrategy());
        System.out.println(realResolver.solve(4, 3, 2));
        System.out.println(realResolver.solve(4, 9, 2));

    }
}
