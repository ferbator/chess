package items;

import static java.lang.Math.abs;

public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!(chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn))) {
            return false;
        }
        if (line == toLine && column == toColumn) {
            return false;
        }
        int dx = abs(toLine - line);
        int dy = abs(toColumn - column);

        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);

    }

    @Override
    public String getSymbol() {
        return "H";
    }
}