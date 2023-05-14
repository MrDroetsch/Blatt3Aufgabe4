import java.util.LinkedList;

public class DoubleEndedQueue<T> {

    // LinkedList ist in der Java-Implementierung eine Doppelt verkettete Liste
    private final LinkedList<T> content;

    public DoubleEndedQueue() {
        content = new LinkedList<>();
    }

    // Komplexität: O(n)
    public void dispose() {
        content.clear();
    }

    // O(1)
    public boolean empty() {
        return content.isEmpty();
    }

    // O(1)
    public int size() {
        return content.size();
    }

    // O(1)
    public void pushFront(T value) {
        content.addFirst(value);
    }

    // O(1)
    public void pushBack(T value) {
        content.addLast(value);
    }

    // O(1)
    public T popFront() {
        return content.removeFirst();
    }

    // O(1)
    public T popBack() {
        return content.removeLast();
    }

    // O(1)
    public void removeFirst(T value) {
        content.removeFirstOccurrence(value);
    }

    // O(1)
    public void removeLast(T value) {
        content.removeLastOccurrence(value);
    }

    // O(1)
    public T getFront() {
        return content.getFirst();
    }

    // O(1)
    public T getBack() {
        return content.getLast();
    }

    // O(n)
    public boolean find(T value) {
        return content.contains(value);
    }

    // O(n)
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("DoubleEndedQueue[");

        for(T value : content) {
            builder.append(value);
            builder.append(",");
        }

        int index = builder.lastIndexOf(",");
        if(index >= 0) builder.deleteCharAt(index);

        builder.append("]");

        return builder.toString();
    }
}
