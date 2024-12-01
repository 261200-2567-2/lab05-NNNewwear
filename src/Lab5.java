public class Lab5 {
    public static void main(String[] args) {
        Character test1 = new CharacSwordMan("test1", 100);
        Character test2 = new CharacArcher("test2", 100);

        Accessory Accestest1 = new Rings("Accestest1", 50);
        Accessory Accestest2 = new Charms("Accestest2", 50);

        test1.ShowStat();
        test1.LevelUp();
        test1.ShowStat();
        test1.Berserk();
        test1.ShowStat();
        test2.ShowStat();
        test2.BuyItem(Accestest1);
        test1.Attack(test2);
        test2.ShowStat();
        test2.UseAccesSkill(test2);
        test2.ChargedArrow();
        test2.ShowStat();
        test1.BuyItem(Accestest2);
        test1.UseAccesSkill(test1);
        test1.ShowStat();
    }
}
