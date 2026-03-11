package lab2.task4.logic;

import lab2.task4.model.Circuit;

public class Series extends Circuit {
    private Circuit a , b;

    public Series(Circuit a , Circuit b) {
        this.a= a;
        this.b = b;
    }


    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    @Override
    public  void applyPotentialDiff(double V) {
        double curr = V / getResistance();

        a.applyPotentialDiff(curr * a.getResistance());
        b.applyPotentialDiff(curr * b.getResistance());
    }
}
