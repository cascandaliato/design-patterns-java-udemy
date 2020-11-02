package iterator;

import java.util.Iterator;
import java.util.Stack;

public class PreOrderIterator<T> implements Iterator<Node<T>> {

    private final Stack<Node<T>> stack = new Stack<>();

    public PreOrderIterator(Node<T> root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return stack.size() > 0;
    }

    @Override
    public Node<T> next() {
        Node<T> node = stack.pop();

        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);

        return node;
    }
}
