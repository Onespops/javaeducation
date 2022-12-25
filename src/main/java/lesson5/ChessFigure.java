package lesson5;

public abstract class ChessFigure {
  int row;
  int col;
  boolean isWhite;

  public ChessFigure(int row, int col, boolean isWhite) {
    this.row = row;
    this.col = col;
    this.isWhite = isWhite;
  }

  abstract boolean isLegalMove(int newRow, int newCol);
}
