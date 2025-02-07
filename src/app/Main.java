package app;

public class Main {
    private static final double CONV_K = 1.609344;

    public static void main(String[] args) {
        System.out.println("Converter app");

        double mls = 5;
        double kms = convMilesToKm(mls);

        System.out.printf("Result: %,.2f kms.", kms);
    }

    private static double convMilesToKm(double miles) {
        return miles / CONV_K;
    }
}
