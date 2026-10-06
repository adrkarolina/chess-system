package boardgame;

public class Piece {
    protected Position position;
    protected Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public Piece() {
    }

    protected Board getBoard() {
        return board;
    }
}
