package boardgame;

public class BoardException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	public BoardException(String msg) {
		super(msg); //construtor recebe e repassa a mensagem para o contrutor da superclasse RunTimeException
	}
}
