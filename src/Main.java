public class Main {

    public static double calculateTotalMealPrice(
            double tipRate,
            double listedMealPrice,
            double taxRate
    ) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(.18, 22.2, .08);
        System.out.println(groupTotalMealPrice);
    }

}
