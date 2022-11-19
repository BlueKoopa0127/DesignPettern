import java.util.ArrayList;
import java.util.Iterator;

public class AllHeroData {
    private static AllHeroData heroList = new AllHeroData();
    private HeroList fav;
    private Aggregate<HeroData> str, agi, inte;

    private AllHeroData() {
        fav = new HeroList(new ArrayList<HeroData>());
        fav.append(new HeroData("Viper", 1));
        fav.append(new HeroData("Undying", 1));

        str = new HeroArray(new HeroData[] { new HeroData("Abaddon", 1), new HeroData("Alchemist", 1),
                new HeroData("Undying", 1) });
        agi = new HeroArray(new HeroData[] { new HeroData("Anti-Mage", 1), new HeroData("Arc Warden", 3),
                new HeroData("Viper", 1) });
        inte = new HeroArray(new HeroData[] { new HeroData("Ancient Apparition", 2), new HeroData("Bane", 2) });
    }

    public static AllHeroData getInstance() {
        return heroList;
    }

    public Iterator<HeroData> getFav() {
        return fav.iterator();
    }

    public Iterator<HeroData> getAll() {
        HeroList list = new HeroList(new ArrayList<HeroData>());
        list.appendList(getStr());
        list.appendList(getAgi());
        list.appendList(getInt());
        return list.iterator();
    }

    public Iterator<HeroData> getStr() {
        return str.iterator();
    }

    public Iterator<HeroData> getAgi() {
        return agi.iterator();
    }

    public Iterator<HeroData> getInt() {
        return inte.iterator();
    }
}
