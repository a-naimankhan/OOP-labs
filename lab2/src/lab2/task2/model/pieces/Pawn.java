package lab2.task2.model.pieces;

import lab2.task2.model.Piece;
import lab2.task2.model.Position;

public class Pawn extends Piece {
    public Pawn(Position a) {super(a);}

    @Override
    public boolean isLegalMove(Position b) {
        return b.getX() == a.getX() && b.getY() == a.getY() + 1;
    }
}
