import java.util.Iterator;

public class HeroDataIterator implements Iterator<HeroData> {
    private Aggregate<HeroData> heroTypeList;
    private int index;

    public HeroDataIterator(Aggregate<HeroData> h) {
        heroTypeList = h;
        index = 0;
    }

    public boolean hasNext() {
        return index < heroTypeList.getLength();
    }

    public HeroData next() {
        HeroData h = heroTypeList.getAt(index);
        index++;
        return h;
    }
}
