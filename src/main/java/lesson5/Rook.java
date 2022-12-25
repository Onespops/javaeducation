package lesson5;

public class Rook extends ChessFigure {
  public Rook(int row, int col, boolean isWhite) {
    super(row, col, isWhite);
  }

  @Override
  boolean isLegalMove(int newRow, int newCol) {
    if (newRow == row) {
      return newCol != col;
    } else if (newCol == col) {
      return true;
    } else {
      return false;
    }
  }
}
