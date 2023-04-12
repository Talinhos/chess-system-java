package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColmuns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColmun());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
		}

		// left
		p.setValues(position.getRow(), position.getColmun() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
			p.setColmun(p.getColmun() - 1);
			;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
		}

		// right
		p.setValues(position.getRow(), position.getColmun() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
			p.setColmun(p.getColmun() + 1);
			;
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
		}
		
		// below
		p.setValues(position.getRow() + 1, position.getColmun());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColmun()] = true;
		}

		return mat;
	}

}
