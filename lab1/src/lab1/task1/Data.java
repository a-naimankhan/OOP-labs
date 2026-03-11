package lab1.task1;

public class Data {
    private double sum;
    private int amount;
    private double currentMax;

    public Data() {
        this.sum = 0 ;
        this.amount = 0;
        this.currentMax = Double.NEGATIVE_INFINITY;
    }

    public void add(double value) {
        sum += value;
        amount++;
        if (value > currentMax) {
            currentMax = value;
        }
    }

    public double getAverage() {
        if (amount == 0) {
            return 0;
        }
        return sum / amount;
    }



    public double getMax() {
        if (amount == 0) {
            return 0;
        }
        return this.currentMax;
    }

    @Override
    public String toString() {
        return "Average = " + this.getAverage() + "\nMaxium = " + getMax();
    }


}
