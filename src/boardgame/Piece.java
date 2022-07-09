package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //a posicao de uma peça recem criada começa como nula, pra informar que nao foi colocada ainda
    }

    protected Board getBoard() { //somente classes do mesmo pacote poderão alterar
        return board;
    }
    //nao foi colocado o set porque nao quero que haja modificacao do tabuleiro
}
