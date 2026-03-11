package lab2.task2.model;

import lab2.task2.model.pieces.*;

public class Board {

    //TODO
    //ADD the logic of the Pieces move and then use setPiece to point the Piece to the new place
    //ADD method removePiec from it's last place .
    private Piece[][] cells = new Piece[8][8];

    public void setPiece(int x , int y , Piece p) {
        cells[x-1][y-1] = p;
    }

    public void setupStandartBoard() {
        for (int i = 1 ; i <= 8 ; i++) {
            setPiece(i, 2, new Pawn(new Position(i, 2)));
            setPiece(i, 7, new Pawn(new Position(i, 7)));
        }
        //Whitt Rooks

        setPiece(1, 1, new Rook(new Position(1, 1)));
        setPiece(8, 1, new Rook(new Position(8, 1)));

        //Black Rooks
        setPiece(1, 8, new Rook(new Position(1, 8)));
        setPiece(8, 8, new Rook(new Position(8, 8)));


        // Knights :
        setPiece(3, 1, new Knight(new Position(3, 1)));
        setPiece(6, 1, new Knight(new Position(6, 1)));

        //Black knight :
        setPiece(3, 8, new Knight(new Position(3, 8)));
        setPiece(6, 8, new Knight(new Position(6, 8)));

        //Bishops :
        setPiece(2, 1, new Bishop(new Position(2, 1)));
        setPiece(7, 1, new Bishop(new Position(7, 1)));

        //black
        setPiece(2, 8, new Bishop(new Position(2, 8)));
        setPiece(7, 8, new Bishop(new Position(7, 8)));

        //King
        setPiece(4 , 1 , new King(new Position(4, 1)));
        setPiece(4 , 8 , new King(new Position(4, 8)));


        //Quens :
        setPiece(5, 1, new Queen(new Position(5 , 1)));
        setPiece(5, 8, new Queen(new Position(5 , 8)));


    }

    public void printBoard() {
        System.out.println("   1 2 3 4 5 6 7 8");
        for(int y = 7 ; y >= 0 ; y--) {
            System.out.print((y+1) + " ");
            for (int x = 0 ; x < 8; x++) {
                if (cells[x][y] == null) {
                    System.out.print(". ");
                } else {
                    String name = cells[x][y].getClass().getSimpleName();
                    char icon = (name.equals("Knight")) ? 'N' : name.charAt(0);
                    System.out.print(icon + " ");
                }
            }
            System.out.println();
         }


    }


}
