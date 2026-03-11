package lab2.task2.model.pieces;

import lab2.task2.model.Piece;
import lab2.task2.model.Position;

public class Bishop extends Piece {
    public Bishop(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        return  (Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()));
    }
}
