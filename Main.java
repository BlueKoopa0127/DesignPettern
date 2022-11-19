import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AllHeroData allHeroData = AllHeroData.getInstance();
        CsvWriter.Write(allHeroData.getFav(), "favorite.csv");
        CsvWriter.Write(allHeroData.getAll(), "allHero.csv");

        List<PersonData> peopleData = new ArrayList<PersonData>();
        peopleData.add(new PersonData("Tsukada", 20));
        peopleData.add(new PersonData("Tago", 23));
        CsvWriter.Write(peopleData.iterator(), "peopleData.csv");
    }
}