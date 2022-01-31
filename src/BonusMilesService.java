public class BonusMilesService {
    public int calculate(int price) {

        int rublesForBonusMile = 20;
        int miles = price / rublesForBonusMile;
        return miles;
    }
}
