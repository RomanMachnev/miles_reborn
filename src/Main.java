public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 50_000;
        long miles = service.calculate(price);
        System.out.println(miles);
    }
}