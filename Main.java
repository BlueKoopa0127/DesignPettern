import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AllHeroData allHeroData = new AllHeroData();
        allHeroData.getFav().add((new HeroData("Ancient Apparition", "INT", 2)));
        CsvWriter.Write(allHeroData.getFav(), "FavoriteHero.csv");
        CsvWriter.Write(allHeroData.getData(), "AllHero.csv");

        List<HeroData> complexity1 = new ArrayList<HeroData>();
        for (HeroData d : allHeroData.getData()) {
            if (d.complexity == 1) {
                complexity1.add(d);
            }
        }

        List<HeroData> str = new ArrayList<HeroData>();
        for (HeroData d : allHeroData.getData()) {
            if (d.type == "STR") {
                str.add(d);
            }
        }

        CsvWriter.Write(complexity1, "Complexity1Hero.csv");
        CsvWriter.Write(str, "StrHero.csv");

        List<PersonData> peopleData = new ArrayList<PersonData>();
        peopleData.add(new PersonData("Tsukada", 20));
        peopleData.add(new PersonData("Tago", 23));
        CsvWriter.Write(peopleData, "PeopleData.csv");
    }
}