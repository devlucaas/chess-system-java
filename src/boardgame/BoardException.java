package boardgame;

public class BoardException extends RuntimeException{// é uma excessao opcional de ser tratada
    private static final long serialVersionUID = 1L;//n de versao

    public BoardException(String msg){
        super(msg);//repassa o construtor da superclasse RuntimeException
    }
}
