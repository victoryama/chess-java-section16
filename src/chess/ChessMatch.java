package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
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
 
	private void initialSetup() {
		//responsável por iniciar a partidade xadrez colocando as peças
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
