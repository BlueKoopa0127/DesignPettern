import java.util.Iterator;

public abstract class HeroDataAggregate implements Aggregate<HeroData> {

    public Iterator<HeroData> iterator() {
        return new HeroDataIterator(this);
    }

    public Iterator<HeroData> iterator_complexity1() {
        return new HeroDataIterator_complexity1(this);
    }

    public Iterator<HeroData> iterator_str() {
        return new HeroDataIterator_str(this);
    }

    public abstract HeroData getAt(int index);

    public abstract int getLength();

}
