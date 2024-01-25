package br.com.rafaelaperruci.chess;

import br.com.rafaelaperruci.boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
