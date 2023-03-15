import java.util.Arrays;
public class statsCalculator
{
    private double[] values;
    private double[] sortedValues;
    public statsCalculator()
    {
        values = new double[20];
    }
    public statsCalculator(double[] values) {
        this.values = values;
        sortedValues = values.clone();
        sortData();
    }


    public void sortData()
    {
        Arrays.sort(sortedValues);
    }
    public double calculateMax() {
        double max = 0;
        for (int i = 0; i < values.length; i++)
        {
            if(values[i] > max)
                max = values[i];
        }
        return max;
    }
    public double calculateMin() {
        double min = 1000;
        for (int i = 0; i < values.length; i++) {
            if(values[i] < min)
                min = values[i];
        }
        return min;
    }
    public double calculateFirstQuartile() {
        int secondQuartileIndex = (sortedValues.length + 1) / 2;
        int firstQuartileIndex = (secondQuartileIndex + 1) / 2;
        double firstQuartile = sortedValues[firstQuartileIndex - 1];
        return firstQuartile;
    }
    public double calculateMedian() {
        double median = 0;
        int length = sortedValues.length;
        if(length % 2 == 0)
            median = (sortedValues[length / 2] + sortedValues[length / 2 - 1]) / 2.0;
        else
            median = (length / 2);
        return median;
    }
    public double calculateThirdQuartile() {
        int secondQuartileIndex = (sortedValues.length + 1) / 2;
        int thirdQuartileIndex = (secondQuartileIndex + sortedValues.length) / 2;
        double thirdQuartile = sortedValues[thirdQuartileIndex - 1];
        return thirdQuartile;
    }
    public double calculateSum() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
    public double calculateMean() {
        double sum = calculateSum();
        return sum / values.length;
    }
    public String printSorted() {
        return Arrays.toString(sortedValues);
    }
    public String print() {
        return Arrays.toString(values);
    }
}
