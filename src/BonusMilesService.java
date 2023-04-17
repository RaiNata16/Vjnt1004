public class BonusMilesService {
    public int calculate(int price) {
        int limitBonus = 20;
        int kmil = 0;
        if (price >= limitBonus) {
            kmil = price / limitBonus;
        }
        return kmil;
    }

}
