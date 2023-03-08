import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gen = new Random();
        double[] testValues = new double[20];

        for (int i = 0; i < testValues.length; i++)
        {
            testValues[i] = Math.round(gen.nextDouble() * 100);
        }
        System.out.println("Initial set of values: ");
        for (int i = 0; i < testValues.length; i++)
        {
            System.out.print(testValues[i] + ", ");
        }


        statsCalculator calc = new statsCalculator();



    }
}
