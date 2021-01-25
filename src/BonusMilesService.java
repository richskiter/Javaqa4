public class BonusMilesService {
    public int calculate(float ticket) {

        int equivalent = 20;

        if (ticket > 0) {
            return (int) ticket / equivalent;
        }
        return 0;
    }
}