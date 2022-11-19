import java.util.Iterator;

public interface Aggregate<T> {
    public Iterator<T> iterator();

    public T getAt(int index);

    public int getLength();
}
