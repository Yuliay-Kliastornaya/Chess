public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (isBorder(line, column, toLine, toColumn)) {
            if (Math.abs(toLine - line) == 1 && toColumn == column) {
                return true;
            } else if (Math.abs(toColumn - column) == 1 && toLine == line) {
                return true;
            } else if (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1) {
                return true;
            } else
               return false;
        } else
            return false;
        }


    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        return false;
    }


}
