import java.util.Objects;

abstract class Character implements Characters{
    private String CharacterName;
    private int Hp = 100, MaxHp = 100, Atk = 5, Level = 0, coin = 0;
    private boolean equipped = false;
    private Accessory equipment;

    public Character(String Name, int coin){
        CharacterName = Name;
        this.coin = coin;
    }

    public void Attack(Character name){
        name.Hp -= Atk;
    }

    public void LevelUp(){
        Level++;
        MaxHp += 10*Level;
        Atk += 3*Level;

        Hp = MaxHp;
    }

    public void ShowStat(){
        System.out.println("Name : " + CharacterName + ", Level : " + Level + ", Hp : " + Hp + ", Atk : " + Atk + ", coin : " + coin);
    }

    public int ShowAtk(){
        return Atk;
    }

    public int ShowHp(){
        return Hp;
    }

    public int ShowMaxHp(){
        return MaxHp;
    }

    public void SetAtk(int Atk){
        this.Atk = Atk;
    }

    public void SetHp(int Hp){
        this.Hp = Hp;
    }

    public void BuyItem(Accessory name){
        if(!equipped && coin >= name.ShowPrice()){
            coin -= name.ShowPrice();
            equipment = name;
            equipped = true;
        }
    }

    public void SellItem(){
        if(equipped){
            equipped = false;
            coin += equipment.ShowPrice();
            equipment = null;
        }
    }

    public void UseAccesSkill(Character name){
        if(equipped){
            equipment.UseSkill(name);
        }
    }

    public void Berserk(){}
    public void ChargedArrow(){}
}

class CharacSwordMan extends Character implements SwordMan{
    public CharacSwordMan(String Name, int coin) {
        super(Name, coin);
    }

    public void Berserk(){
        SetAtk(super.ShowAtk() + 10);
    }
}

class CharacArcher extends Character implements Archer{
    public CharacArcher(String Name, int coin) {
        super(Name, coin);
    }

    public void ChargedArrow(){
        SetAtk(super.ShowAtk() + 15);
    }
}