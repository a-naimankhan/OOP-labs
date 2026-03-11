package lab2.task2.model;

public class Position {
    int x , y;

    public Position(int x , int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isValid() {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return  false;

        Position position = (Position) obj;
        return x == position.x && y == position.y;
    }
}
