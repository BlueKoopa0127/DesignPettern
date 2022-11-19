import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AllHeroData allHeroData = AllHeroData.getInstance();
        allHeroData.getFav().append(new HeroData("Ancient Apparition", 2));
        CsvWriter.Write(allHeroData.getFavIte(), "favorite.csv");
        CsvWriter.Write(allHeroData.getAllIte(), "allHero.csv");

        List<PersonData> peopleData = new ArrayList<PersonData>();
        peopleData.add(new PersonData("Tsukada", 20));
        peopleData.add(new PersonData("Tago", 23));
        CsvWriter.Write(peopleData.iterator(), "peopleData.csv");
    }
}