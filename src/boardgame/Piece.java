package boardgame;

public abstract class Piece {
	
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

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()]; //hook methods
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
