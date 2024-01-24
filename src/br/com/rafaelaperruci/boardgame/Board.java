package br.com.rafaelaperruci.boardgame;

public class Board {
    private int rows;
    private int columns;

    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if ( rows < 1 || columns < 1){
            throw new BoardException("Error: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if (!positionExists(row, column)){
            throw new BoardException("Error: Position not on the board.");
        }

        return pieces [row] [column];     //método que retorna a peça correspondente a linha e coluna da matriz
    }
    public Piece piece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Error: Position not on the board.");
        }
        return pieces[position.getRow()] [position.getColumn()]; //aqui retorna a exata posição em que a peça está
    }
    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)){
            throw new BoardException("Error, there is already a piece on position: " + position);
        }

        pieces[position.getRow()][position.getColumn()] = piece;    //aqui eu atribuo a posição da matriz a peça correspondente
        piece.position = position;                                 //e aqui eu atualizo sua posição
    }

    private boolean positionExists(int row, int column){
        return row >=0 && row < rows && column >=0 && column < columns;
    }
    public boolean positionExists(Position position){
        return  positionExists(position.getRow(), position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if (!positionExists(position)){
            throw new BoardException("Error: Position not on the board.");
        }
        return piece(position) != null;               //se o método chamado retornar uma posição, indica que ele é != null
    }
}
