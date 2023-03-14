import javax.swing.plaf.synth.Region;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random gen = new Random();
        double[] testValues = new double[20];
        double[] sortedValues;
        //<editor-fold desc="Generation">
        for (int i = 0; i < testValues.length; i++)
        {
            testValues[i] = Math.round(gen.nextDouble() * 100);
        }
        //</editor-fold>
        statsCalculator statsCalc = new statsCalculator(testValues);

        System.out.println("Your data: " + Arrays.toString(testValues));
        sortedValues = statsCalc.sortData(testValues);
        System.out.println("Your sorted data is: " + Arrays.toString(sortedValues));



    }
}
