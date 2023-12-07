package trigFunctions;

public class trigFunctions {
    public static double calculateSin(double angelInDegrees) {
        double angelInRadians = Math.toRadians(angelInDegrees);
        return Math.sin(angelInRadians);
    }

    public static double calculateCos(double angelInDegrees) {
        double angelInRadians = Math.toRadians(angelInDegrees);
        return Math.cos(angelInRadians);
    }

    public static double calculateTan(double angelInDegrees) {
        double angelInRadians = Math.toRadians(angelInDegrees);
        return Math.tan(angelInRadians);
    }
}
