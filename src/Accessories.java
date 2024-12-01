public interface Accessories {
    void LevelUpMastery();
    void ShowMastery();
    int ShowPrice();
}

interface Ring extends Accessories {
    void Heal();
}

interface Charm extends Accessories {
    void Luck();
}