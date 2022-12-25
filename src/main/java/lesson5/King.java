package lesson5;

public class King extends ChessFigure {
  public King(int row, int col, boolean isWhite) {
    super(row, col, isWhite);
  }

  @Override
  boolean isLegalMove(int newRow, int newCol) {
    return Math.abs(newRow - row) == 1 || Math.abs(newCol - col) == 1;
  }
}
