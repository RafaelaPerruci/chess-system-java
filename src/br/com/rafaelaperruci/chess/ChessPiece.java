package br.com.rafaelaperruci.chess;

import br.com.rafaelaperruci.boardgame.Board;
import br.com.rafaelaperruci.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
