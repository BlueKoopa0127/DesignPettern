import java.util.ArrayList;

public class AllHeroData {
    private static AllHeroData heroList = new AllHeroData();
    private HeroList fav;
    private HeroDataAggregate data;

    private AllHeroData() {
        fav = new HeroList(new ArrayList<HeroData>());
        fav.append(new HeroData("Viper", "STR", 1));
        fav.append(new HeroData("Undying", "STR", 1));

        data = new HeroArray(new HeroData[] { new HeroData("Abaddon", "STR", 1), new HeroData("Alchemist", "STR", 1),
                new HeroData("Undying", "STR", 1), new HeroData("Anti-Mage", "AGI", 1),
                new HeroData("Arc Warden", "AGI", 3),
                new HeroData("Viper", "AGI", 1), new HeroData("Ancient Apparition", "INT", 2),
                new HeroData("Bane", "INT", 2) });
    }

    public static AllHeroData getInstance() {
        return heroList;
    }

    public HeroList getFav() {
        return fav;
    }

    public HeroDataAggregate getData() {
        return data;
    }
}
