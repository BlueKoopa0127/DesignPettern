import java.util.ArrayList;
import java.util.List;

public class AllHeroData {
    private List<HeroData> fav;
    private HeroData[] data;

    public AllHeroData() {
        fav = new ArrayList<HeroData>();
        fav.add(new HeroData("Viper", "STR", 1));
        fav.add(new HeroData("Undying", "STR", 1));

        data = new HeroData[] { new HeroData("Abaddon", "STR", 1), new HeroData("Alchemist", "STR", 1),
                new HeroData("Undying", "STR", 1), new HeroData("Anti-Mage", "AGI", 1),
                new HeroData("Arc Warden", "AGI", 3),
                new HeroData("Viper", "AGI", 1), new HeroData("Ancient Apparition", "INT", 2),
                new HeroData("Bane", "INT", 2) };
    }

    public List<HeroData> getFav() {
        return fav;
    }

    public HeroData[] getData() {
        return data;
    }
}
