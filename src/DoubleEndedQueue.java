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

    // Komplexität: O(1)
    public boolean empty() {
        return content.isEmpty();
    }

    // Komplexität: O(1)
    public int size() {
        return content.size();
    }

    // Komplexität: O(1)
    public void pushFront(T value) {
        content.addFirst(value);
    }

    // Komplexität: O(1)
    public void pushBack(T value) {
        content.addLast(value);
    }

    // Komplexität: O(1)
    public T popFront() {
        return content.removeFirst();
    }

    // Komplexität: O(1)
    public T popBack() {
        return content.removeLast();
    }

    // Komplexität: O(1)
    public void removeFirst(T value) {
        content.removeFirstOccurrence(value);
    }

    // Komplexität: O(1)
    public void removeLast(T value) {
        content.removeLastOccurrence(value);
    }

    // Komplexität: O(1)
    public T getFront() {
        return content.getFirst();
    }

    // Komplexität: O(1)
    public T getBack() {
        return content.getLast();
    }

    // Komplexität: O(n)
    public boolean find(T value) {
        return content.contains(value);
    }

    // Komplexität: O(n)
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
