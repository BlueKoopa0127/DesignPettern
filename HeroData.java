public class HeroData implements ICsv {
    public String name;
    public int complexity;

    public HeroData(String _name, int _complexity) {
        name = _name;
        complexity = _complexity;
    }

    public String toCsv() {
        return name + "," + complexity;
    }
}
