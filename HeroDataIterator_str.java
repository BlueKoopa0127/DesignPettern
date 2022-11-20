import java.util.Iterator;

public class HeroDataIterator_str implements Iterator<HeroData> {
    private Aggregate<HeroData> heroAggr;
    private int index;

    public HeroDataIterator_str(Aggregate<HeroData> h) {
        heroAggr = h;
        index = 0;
    }

    public boolean hasNext() {
        while (index < heroAggr.getLength()) {
            HeroData h = heroAggr.getAt(index);
            if (h.getType() == "STR") {
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
