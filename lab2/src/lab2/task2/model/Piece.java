package lab2.task2.model;



public abstract class Piece {
    protected Position a;

    public Piece(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b);

    public void move(Position b) {
        if (isLegalMove(b)) {
            this.a = b;
        } else {
            System.out.println("Illegal move!");
        }
    }
}
