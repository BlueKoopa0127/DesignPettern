public class HeroData implements ICsv {
    public String name;
    public String type;
    public int complexity;

    public HeroData(String _name, String _type, int _complexity) {
        name = _name;
        type = _type;
        complexity = _complexity;
    }

    public String toCsv() {
        return name + "," + type + "," + complexity;
    }
}
