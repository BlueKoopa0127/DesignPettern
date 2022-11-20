import java.util.Iterator;

public class HeroDataIterator_complexity1 implements Iterator<HeroData> {
    private Aggregate<HeroData> heroAggr;
    private int index;

    public HeroDataIterator_complexity1(Aggregate<HeroData> h) {
        heroAggr = h;
        index = 0;
    }

    public boolean hasNext() {
        while (index < heroAggr.getLength()) {
            HeroData h = heroAggr.getAt(index);
            if (h.getComplexity() == 1) {
                return true;
            }
            index++;
        }
        return false;
    }

    public HeroData next() {
        HeroData h = heroAggr.getAt(index);
        index++;
        return h;
    }
}
