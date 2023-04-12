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
	
	public void setValues(int row, int column) {
		this.row = row;
		this.colmun = column;
	}
	
	@Override
	public String toString() {
		
		return row + ", " + colmun;
	}
	

}
