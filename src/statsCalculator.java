import java.util.Arrays;
public class statsCalculator
{
    private double[] values;
    private double[] sortedValues;
    public statsCalculator()
    {
        values = new double[20];
    }
    public statsCalculator(double[] values)
    {
        this.values = values;
        sortData(values);
    }


    public void sortData()
    {
        Arrays.sort(values);
    }
    public double[] sortData(double[] values) {
        double[] copy = values;
        Arrays.sort(copy);
        return copy;
    } // for me
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
        double min = 0;
        for (int i = 0; i < values.length; i++) {
            if(values[i] < min)
                min = values[i];
        }
        return min;
    }


}
