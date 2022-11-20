public class HeroData implements ICsv {
    private String name;
    private String type;
    private int complexity;

    public HeroData(String _name, String _type, int _complexity) {
        name = _name;
        type = _type;
        complexity = _complexity;
    }

    public String getType() {
        return type;
    }

    public int getComplexity() {
        return complexity;
    }

    public String toCsv() {
        return name + "," + type + "," + complexity;
    }
}
