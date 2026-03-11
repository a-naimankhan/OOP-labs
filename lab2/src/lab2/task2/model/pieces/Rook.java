package lab2.task2.model.pieces;

import lab2.task2.model.Piece;
import lab2.task2.model.Position;

public class Rook extends Piece {
    public Rook(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b) {
        return a.getX() == b.getX() || a.getY() == b.getY();
    }
}
