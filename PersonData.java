public class PersonData implements ICsv {
    public String name;
    public int age;

    public PersonData(String _name, int _age) {
        name = _name;
        age = _age;
    }

    public String toCsv() {
        return name + "," + age;
    }
}