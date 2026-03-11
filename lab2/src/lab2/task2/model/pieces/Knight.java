package lab2.task2.model.pieces;

import lab2.task2.model.Piece;
import lab2.task2.model.Position;

public class Knight extends Piece {
    public Knight(Position a) {super(a);}

    @Override
    public boolean isLegalMove(Position b) {
        int dx = Math.abs(a.getX() - b.getX());
        int dy = Math.abs(a.getY() - b.getY());
        return dx * dy == 2;
    }
}
