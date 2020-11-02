package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);

        Node<Integer> two = new Node<>(2);
        root.left = two;
        root.right = new Node<>(3);

        two.left = new Node<>(4);
        two.right = new Node<>(5);

        for (Iterator<Node<Integer>> it = root.preOrder(); it.hasNext(); ) {
            Node<Integer> node = it.next();
            System.out.println(node.value);
        }
    }
}
