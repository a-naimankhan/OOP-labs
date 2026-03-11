package lab2.task2.model;

public class Board {
    private Piece[][] cells = new Piece[8][8];

    public void setPiece(int x , int y , Piece p) {
        cells[x-1][y-1] = p;
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
