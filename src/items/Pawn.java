package items;

public class Pawn extends ChessPiece {


    public Pawn(String color) {
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
        if (color.equals("White")) {
            if (toLine == line + 1 && toColumn == column) {
                return true;
            }
            return line == 1 && toLine == line + 2 && toColumn == column;
        }
        else if (color.equals("Black")) {
            if (toLine == line - 1 && toColumn == column) {
                return true;
            }
            return line == 6 && toLine == line - 2 && toColumn == column;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}