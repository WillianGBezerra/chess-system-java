package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Prize extends ChessPiece{
	
	public Prize(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "P";
	}

}
