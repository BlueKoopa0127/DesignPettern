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

    public Iterator<HeroData> getFavIte() {
        return fav.iterator();
    }

    public HeroList getFav() {
        return fav;
    }

    public Iterator<HeroData> getAllIte() {
        HeroList list = new HeroList(new ArrayList<HeroData>());
        list.appendList(getStrIte());
        list.appendList(getAgiIte());
        list.appendList(getIntIte());
        return list.iterator();
    }

    public Iterator<HeroData> getStrIte() {
        return str.iterator();
    }

    public Iterator<HeroData> getAgiIte() {
        return agi.iterator();
    }

    public Iterator<HeroData> getIntIte() {
        return inte.iterator();
    }
}
