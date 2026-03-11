package lab1.task2;


enum Brightness { LOW, MEDIUM, HIGH }

public class SmartLamp {
    public static final String BRAND = "EcoLight";
    public static double networkVoltage = 220.0;

    private final String serialNumber;
    private int power;
    private Brightness mode;

    {
        this.mode = Brightness.LOW;
    }

    public SmartLamp(String serialNumber) {
        this(serialNumber, 10);
    }

    public SmartLamp(String serialNumber, int power) {
        this.serialNumber = serialNumber;
        this.power = power;
    }

    public void setup() {
        System.out.println("Default setup");
    }

    public void setup(Brightness mode) {
        this.mode = mode;
    }
}