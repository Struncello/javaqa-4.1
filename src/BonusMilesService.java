public class BonusMilesService {
public int calculate(int price) {
        int miles = price / 20;
        if (price < 20) {
            miles = 1;
        }
        return miles;
    }
}