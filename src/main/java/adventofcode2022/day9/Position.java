package adventofcode2022.day9;

import java.util.Objects;

public class Position {

    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position move(Direction direction) {
        return switch (direction) {
            case UP -> new Position(x, y + 1);
            case DOWN -> new Position(x, y - 1);
            case LEFT -> new Position(x - 1, y);
            case RIGHT -> new Position(x + 1, y);
            case UP_LEFT -> new Position(x - 1, y + 1);
            case UP_RIGHT -> new Position(x + 1, y + 1);
            case DOWN_LEFT -> new Position(x - 1, y - 1);
            case DOWN_RIGHT -> new Position(x + 1, y - 1);
        };
    }

    public boolean isAdjacentTo(Position position) {
        int xDiff = Math.abs(x - position.x);
        int yDiff = Math.abs(y - position.y);
        return xDiff < 2 && yDiff < 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Position that = (Position) obj;
        return this.y == that.y && this.x == that.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}