package chess;
import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {//subclasse de piece
    private  Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {//sem get porque nao quero que a cor de uma peça seja modificada
        return color;
    }

}
