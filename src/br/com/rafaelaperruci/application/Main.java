package br.com.rafaelaperruci.application;

import br.com.rafaelaperruci.boardgame.Board;
import br.com.rafaelaperruci.boardgame.Position;
import br.com.rafaelaperruci.chess.ChessMatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());


    }
}