import java.util.Iterator;
import java.util.List;

public class HeroList implements Aggregate<HeroData> {
    public List<HeroData> heroList;

    public HeroList(List<HeroData> h) {
        heroList = h;
    }

    public Iterator<HeroData> iterator() {
        return new HeroDataIterator(this);
    }

    public HeroData getAt(int index) {
        return heroList.get(index);
    }

    public int getLength() {
        return heroList.size();
    }

    public void append(HeroData e) {
        heroList.add(e);
    }

    public void appendList(Iterator<HeroData> e) {
        while (e.hasNext()) {
            heroList.add(e.next());
        }
    }

    public void removeAt(int index) {
        heroList.remove(index);
    }
}