public class Main {
    public static void main(String[] args) {
        AllHeroData allHeroData = AllHeroData.getInstance();
        allHeroData.getFav().append(new HeroData("Ancient Apparition", "INT", 2));
        CsvWriter.Write(allHeroData.getFav().iterator(), "FavoriteHero.csv");
        CsvWriter.Write(allHeroData.getData().iterator(), "AllHero.csv");
        CsvWriter.Write(allHeroData.getData().iterator_complexity1(), "Complexity1Hero.csv");
        CsvWriter.Write(allHeroData.getData().iterator_str(), "StrHero.csv");
    }
}