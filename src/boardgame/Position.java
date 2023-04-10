package boardgame;

public class Position {
	
	private int row;
	private int colmun;
	
	public Position(int row, int colmun) {
		this.row = row;
		this.colmun = colmun;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColmun() {
		return colmun;
	}

	public void setColmun(int colmun) {
		this.colmun = colmun;
	}
	
	@Override
	public String toString() {
		
		return row + ", " + colmun;
	}
	
	

}
