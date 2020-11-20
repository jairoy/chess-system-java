package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int  movCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return movCount;
	}
	
	public void increaseMoveCount(){
		movCount++;		
	}
	
	public void decreaseMoveCount(){
		movCount--;		
	}	
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPostion(position);
	}
	
	protected boolean isThereOpponetPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}	
	

}
