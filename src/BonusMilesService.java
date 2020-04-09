public class BonusMilesService {
    public int calculate(int cost) {
        int accruals = 20;
        int miles = cost / accruals;
        System.out.println(miles);
        return miles;
    }
}
