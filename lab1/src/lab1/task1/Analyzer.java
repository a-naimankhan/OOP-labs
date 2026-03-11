package lab1.task1;

import java.util.Scanner;

public class Analyzer {


    public static void run() {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        while (true) {
            System.out.print("Enter a number : (Q to quit) : ");
            String cmd = sc.nextLine();
            if (cmd.equals("Q")) {
                System.out.println("Average : " + data.getMax());
                System.out.println("Maxium : " + data.getAverage());
                break;
            } else {
                try {
                    double dnum = Double.parseDouble(cmd);
                    data.add(dnum);
                } catch (NumberFormatException e) {
                    System.out.println("invalid input");
                }
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
