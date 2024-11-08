package items;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка на выход за пределы доски
        if (!(chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn))) {
            return false;
        }

        // Проверка на то, что слон не остается на месте
        if (line == toLine && column == toColumn) {
            return false;
        }

        // Проверка, может ли слон двигаться по диагонали
        return Math.abs(toLine - line) == Math.abs(toColumn - column);
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
