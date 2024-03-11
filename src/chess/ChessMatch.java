package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		//percorrer matriz de peças do tabuleiro e para cada peça do tabuleiro vou fazer downcasting para chessPiece
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j); //para cada posicao I j do tabuleiro, vou fazer que a matriz mat receba a peça o board.piece, downcasting para chesspiece, recebe como peça de xadrez
		}
			}
		return mat; //retorna a matriz de peças da partida de xadrez
	}
 
}
