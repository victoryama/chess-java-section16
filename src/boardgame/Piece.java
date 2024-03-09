package boardgame;

public class Piece {
	
	protected Position position; //não se quer ela visivel na camada de xadrez
	private Board board; //associacao da peça com o tabuleiro
	
	//so passar o construtor board, pois a position inicial criada devera ser nula
	
	public Piece(Board board) {
		this.board = board;
		position = null; //por padrao Java considera nulo, não necessita este passo
	}

	protected  Board getBoard() {
		return board;
	}

	
	
}
