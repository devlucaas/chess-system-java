package chess;

import boardgame.Board;
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

    private  void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){//responsavel por iniciar a partida
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
    }
}
