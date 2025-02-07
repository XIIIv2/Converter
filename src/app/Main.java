package app;

public class Main {
    private static final double CONV_K = 1.609344;

    public static void main(String[] args) {
        System.out.println("Converter app");

        double mls = 5;
        double km = 12;
        double kms = convMilesToKm(mls);
        double miles = convKmToMiles(km);

        System.out.printf("Result: %,.2f kms and %,.2f miles.", kms, miles);
    }

    private static double convMilesToKm(double miles) {
        return miles / CONV_K;
    }

    private static double convKmToMiles(double km) {
        return km * CONV_K;
    }
}
