package items;

public class Queen extends ChessPiece {

    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        // Проверка выхода за пределы доски
        if (!(chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn))) {
            return false;
        }
        // Проверка на то, что фигура не остается на месте
        if (line == toLine && column == toColumn) {
            return false;
        }

        // Проверка на движение по прямой или по диагонали
        return (line == toLine || column == toColumn || Math.abs(line - toLine) == Math.abs(column - toColumn));
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

}