package lab1.task3;

public class App {
    public static void main(String[] args ) {
        Temperature t1 = new Temperature(); // 0 C
        Temperature t2 = new Temperature(100); // 100 C
        Temperature t3 = new Temperature(32, 'F'); // 32 F

        System.out.println("T1 (Celcius) : " + t1.getCelcius());
        System.out.println("T2 (Celcius) : " + t1.getCelcius());
        System.out.println("T3 (Farenheit) : " + t1.getCelcius());
        System.out.println("T1 (Celcius) : " + t1.getCelcius());


    }
}
