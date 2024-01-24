package br.com.rafaelaperruci.boardgame;

public class Piece {
    protected Position position; //initialized null
    private Board board;

    public Piece(Board board) {
        this.board = board;

    }

    protected Board getBoard() {
        return board;
    }

}
