package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //a posicao de uma peça recem criada começa como nula, pra informar que nao foi colocada ainda
    }

    protected Board getBoard() { //somente classes do mesmo pacote poderão alterar
        return board;
    }//nao foi colocado o set porque nao quero que haja modificacao do tabuleiro

    public abstract boolean[][] possibleMoves();
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}

