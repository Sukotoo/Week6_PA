import java.util.Arrays;
public class statsCalculator
{
    private double[] values;
    private double[] sortedValues;
    public statsCalculator()
    {
        values = new double[20];
        sortedValues = values;
        sortData();
    }
    public statsCalculator(double[] values)
    {
        this.values = values;
        sortedValues = values;
        sortData();
    }


    public void sortData()
    {
        Arrays.sort(values);
    }
    public double[] sortData(double[] values) {
        double[] copy = values;
        Arrays.sort(copy);
        return copy;
    }
    public double calculateMax()
    {
        //for (int i = 0; i < ; i++) {
            
        return 0.1;
    }
}
