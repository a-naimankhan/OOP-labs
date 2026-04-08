package lab2.task2.model.pieces;

import lab2.task2.model.Piece;
import lab2.task2.model.Position;

public class Queen extends Piece {
    public Queen(Position a) {super(a);}

    @Override
    public boolean isLegalMove(Position b) {

        Bishop bishop = new Bishop(b );
        Rook rook = new Rook(b);
        boolean asRook = a.getX() == b.getX() || a.getY() == b.getY();
        boolean asBishop = (Math.abs(a.getX() - b.getX()) == Math.abs(a.getY() - b.getY()));
//        return  asRook || asBishop;
        return bishop.isLegalMove( b) || rook.isLegalMove(b);
    }
}
