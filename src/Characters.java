public interface Characters {
    void LevelUp();
    void ShowStat();
    void SellItem();
    int ShowAtk();
    int ShowHp();
    int ShowMaxHp();
    void SetAtk(int Atk);
    void SetHp(int Hp);
}

interface SwordMan extends Characters {
    void Berserk();
}

interface Archer extends Characters {
    void ChargedArrow();
}