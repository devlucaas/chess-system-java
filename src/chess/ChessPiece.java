package chess;
import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {//subclasse de piece
    private  Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {//sem get porque nao quero que a cor de uma peça seja modificada
        return color;
    }

    public ChessPosition getChessPosition(){//pegando a posicao da peça
        return ChessPosition.fromPosition(position);
    }
    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;//verificando se a peça é diferente da minha peça
    }
}
