public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);

    public abstract String getSymbol();

    protected boolean isBorder(int line, int column, int toLine, int toColumn) {
        return (line <= 7 && line >= 0 && column <= 7 && column >= 0 && toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0);
    }


}