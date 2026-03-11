package lab1.task3;

public class Temperature {
    private double  value;
    private char scale;


    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public Temperature(double value , char scale) {
        this.value = value;
        this.scale = scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public char getScale() {
        return this.scale;
    }

    public double getCelcius() {
        if (this.scale == 'C') {
            return this.value;
        } else {
            return 5 * (this.value - 32) / 9;
        }
    }

    public double getFarenheit() {
        if (this.getScale() == 'F') {
            return this.value;
        } else {
            return (9 * this.value / 5) + 32;
        }
    }

}