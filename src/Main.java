import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random gen = new Random();
        double[] testValues = new double[20];
        //<editor-fold desc="Generation">
        for (int i = 0; i < testValues.length; i++)
        {
            testValues[i] = Math.round(gen.nextDouble() * 100);
        }
        //</editor-fold>
        statsCalculator statsCalc = new statsCalculator(testValues);

        System.out.println("Your data: " + Arrays.toString(testValues));
        System.out.println("Your sorted data is: " + statsCalc);

        System.out.println("The five number summary is: ");
        System.out.println("    Minimum: " + statsCalc.calculateMin());
        System.out.println("    First quartile: " + statsCalc.calculateFirstQuartile());
        System.out.println("    Median: " + statsCalc.calculateMedian());
        System.out.println("    Third quartile: " + statsCalc.calculateThirdQuartile());
        System.out.println("    Maximum: " + statsCalc.calculateMax());
        System.out.println("The mean is: " + statsCalc.calculateMean());
    }
}
