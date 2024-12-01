abstract class Accessory implements Accessories{
    private String AccessoryName;
    private int LevelMastery = 0, Price = 0;

    public Accessory(String Name, int Price){
        AccessoryName = Name;
        this.Price = Price;
    }

    public void LevelUpMastery(){
        LevelMastery++;
    }

    public void ShowMastery() {
        System.out.println(AccessoryName + " Level : " + LevelMastery);
    }

    public int ShowPrice(){
        return Price;
    }

    public void UseSkill(Character name){}
}

class Rings extends Accessory{
    public Rings(String Name, int Price){
        super(Name, Price);
    }

    public void UseSkill(Character name){
        Heal(name);
    }

    public void Heal(Character name){
        if(name.ShowHp() < name.ShowMaxHp()){
            if(name.ShowMaxHp() - 10 > name.ShowHp()){
                name.SetHp(name.ShowHp() + 10);
            }
            else{
                name.SetHp(name.ShowMaxHp());
            }
        }
    }
}

class Charms extends Accessory{
    public Charms(String Name, int Price){
        super(Name, Price);
    }

    public void UseSkill(Character name){
        Luck(name);
    }

    public void Luck(Character name){
        name.SetAtk(name.ShowAtk() + 5);
    }
}