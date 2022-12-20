public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "H";
    }


    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (isBorder(line, column, toLine, toColumn) && toLine != line && toColumn != column) {

            if (Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1) {
                return true;
            } else if ((Math.abs(toColumn - column) == 2 && Math.abs(toLine - line) == 1)) {
                return true;
            } else
                return false;
        } else
            return false;
    }


}
