public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {


        if (isBorder(line, column, toLine, toColumn) && toLine != line && toColumn != column) {
            if (Math.abs(toLine - line) == Math.abs(toColumn - column)) {
                return true;
            } else
                return false;
        } else
            return false;
    }




}





