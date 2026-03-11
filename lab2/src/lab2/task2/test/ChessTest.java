package lab2.task2.test;

import lab2.task2.model.Board;
import lab2.task2.model.Position;
import lab2.task2.model.pieces.Bishop;
import lab2.task2.model.pieces.King;
import lab2.task2.model.pieces.Knight;

public class ChessTest {
    public static void main(String[] args) {
        //USED AI TO TEST!
        Position startK = new Position(2, 1); // b1
        Knight knight = new Knight(startK);

        Position legalK = new Position(3, 3); // c3
        Position illegalK = new Position(4, 4); // d4

        System.out.println("Knight moves to c3: " + knight.isLegalMove(legalK)); // true
        System.out.println("Knight moves to d4: " + knight.isLegalMove(illegalK)); // false

        // Проверяем Слона (Bishop)
        Bishop bishop = new Bishop(new Position(3, 1)); // c1
        System.out.println("Bishop moves to g5 (diagonal): " + bishop.isLegalMove(new Position(7, 5))); // true

        Board board = new Board();
        board.setPiece(3, 1, new Bishop(new Position(3,1)));
        board.setPiece(2, 1, new Knight(new Position(2,1)));
        board.setPiece(5, 5, new King(new Position(5, 5)));
        board.printBoard();

    }
}
