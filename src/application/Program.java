package application;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());//esse metodo vai receber a matriz de peças da partida
    }
}
