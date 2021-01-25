public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(50000F);
        System.out.println(miles);

        int miles2 = service.calculate(11300.50F);
        System.out.println(miles2);

        int milesZero = service.calculate(0F);
        System.out.println(milesZero);

        int milesNegative = service.calculate(-11300.50F);
        System.out.println(milesNegative);

        int milesBig = service.calculate(30_300_000F);
        System.out.println(milesBig);

        int milesSuperBig = service.calculate(2_147_000_000F);
        System.out.println(milesSuperBig);

        int milesBoundaryBig = service.calculate(2_147_483_647F);
        System.out.println(milesBoundaryBig);

        int milesNegativeBoundaryBig = service.calculate(2_147_483_648F);
        System.out.println(milesNegativeBoundaryBig);

        int milesNegativeBoundary2Big = service.calculate(3_000_000_000F);
        System.out.println(milesNegativeBoundary2Big);

    }
}