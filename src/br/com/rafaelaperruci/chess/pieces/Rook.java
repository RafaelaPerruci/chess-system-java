package br.com.rafaelaperruci.chess.pieces;

import br.com.rafaelaperruci.boardgame.Board;
import br.com.rafaelaperruci.chess.ChessPiece;
import br.com.rafaelaperruci.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
