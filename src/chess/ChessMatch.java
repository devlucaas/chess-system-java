package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {//classe onde terá as regras do jogo
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i< board.getRows(); i++){
            for(int j = 0; j< board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i, j);//downcasting para interpretar ele como ChessPiece e não Piece
            }
        }
        return mat;
    }
    private void initialSetup(){//responsavel por iniciar a partida
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(0,4));
    }
}
