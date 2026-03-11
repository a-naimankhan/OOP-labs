package lab2.task4.test;

import lab2.task4.logic.Parallel;
import lab2.task4.logic.Series;
import lab2.task4.model.Circuit;
import lab2.task4.model.Resistor;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);
        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);
        double R = circuit.getResistance();

        System.out.println("Total Resistance: " + R + " Ohms");


        //USED AI ONLY TO TEST THE APPLICATION!!!! NOTHING MORE!!
        // 2. Подаем напряжение (допустим, 20 Вольт)
        System.out.println("\nApplying 20V to the circuit...");
        circuit.applyPotentialDiff(20.0);

        // 3. Проверяем токи и мощности
        System.out.println("Total Current: " + circuit.getCurrent() + " Amps");
        System.out.println("Total Power: " + circuit.getPower() + " Watts");

        // 4. Самое интересное: залезем внутрь Series (c2)
        // На r3 и r4 напряжение должно распределиться (12V и 8V соответственно)
        System.out.println("\nChecking internal components of Series c2:");
        System.out.println("Voltage on r3: " + r3.getPotentialDiff() + "V");
        System.out.println("Voltage on r4: " + r4.getPotentialDiff() + "V");
    }
}
