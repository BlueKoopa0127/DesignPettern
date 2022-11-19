import java.util.Iterator;

public class HeroDataIterator implements Iterator<HeroData> {
    private Aggregate<HeroData> heroAggr;
    private int index;

    public HeroDataIterator(Aggregate<HeroData> h) {
        heroAggr = h;
        index = 0;
    }

    public boolean hasNext() {
        return index < heroAggr.getLength();
    }

    public HeroData next() {
        HeroData h = heroAggr.getAt(index);
        index++;
        return h;
    }
}
