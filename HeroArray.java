import java.util.Iterator;

public class HeroArray implements Aggregate<HeroData> {
    private HeroData[] heroDatas;

    public HeroArray(HeroData[] h) {
        heroDatas = h;
    }

    public Iterator<HeroData> iterator() {
        return new HeroDataIterator(this);
    }

    public int getLength() {
        return heroDatas.length;
    }

    public HeroData getAt(int index) {
        return heroDatas[index];
    }
}
