public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "R";

    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (isBorder(line, column, toLine, toColumn)) {

            if (Math.abs(toColumn - column) == 0 && toLine != line) {
                return true;
            } else if (Math.abs(toLine - line) == 0 && column != toColumn) {
                return true;
            } else
                return false;
        } else
            return false;
    }


}
