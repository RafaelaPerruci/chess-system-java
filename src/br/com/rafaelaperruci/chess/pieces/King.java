package br.com.rafaelaperruci.chess.pieces;

import br.com.rafaelaperruci.boardgame.Board;
import br.com.rafaelaperruci.chess.ChessPiece;
import br.com.rafaelaperruci.chess.Color;

public class King extends ChessPiece {


    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

}
