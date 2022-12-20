public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    public String getSymbol() {
        return "P";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (isBorder(line, column, toLine, toColumn)){
            if (toLine - line == 2 && color.equals("White") && line == 1 && Math.abs(toColumn - column) == 0 ) {
                return true;
            } else if (toLine - line == -2 && color.equals("Black") && line == 6 && Math.abs(toColumn - column) == 0 ) {
                return true;
            } else if (Math.abs(toColumn - column) == 0 && toLine - line == 1 && color.equals("White")) {
                return true;
            }else if (Math.abs(toColumn - column) == 0 && toLine - line == -1 && color.equals("Black")) {
                return true;
            }
         else
            return false;
    } else
            return false;
}
    public static void main(String[] args) {
        Pawn pawn  = new Pawn ("White");
        System.out.println(pawn.canMoveToPosition(new ChessBoard("White"), 1, 7, 3, 7));
    }
}




