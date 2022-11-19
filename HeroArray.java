public class HeroArray extends HeroDataAggregate {
    private HeroData[] heroDatas;

    public HeroArray(HeroData[] h) {
        heroDatas = h;
    }

    public int getLength() {
        return heroDatas.length;
    }

    public HeroData getAt(int index) {
        return heroDatas[index];
    }
}
