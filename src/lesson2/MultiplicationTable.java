package lesson2;

public class MultiplicationTable {
	private int r1Down, r1Up, r2Down, r2Up;
	private int[][] table;

	public MultiplicationTable(int r1Down, int r1Up, int r2Down, int r2Up) {
		this.r1Down=r1Down;
		this.r1Up=r1Up;
		this.r2Down=r2Down;
		this.r2Up=r2Up;
		if(r1Down>r1Up) throw new IllegalArgumentException("Range 1 not valid");
		if(r2Down>r2Up) throw new IllegalArgumentException("Range 2 not valid");
		this.table = buildTable();
	}

	private int[][] buildTable() {
		int[][] auxTable= new int[r1Up-r1Down+1][r2Up-r2Down+1];
		
		for (int i = 0; i < auxTable.length; i++) {
			for (int j = 0; j <  auxTable[0].length; j++) {
				auxTable[i][j] = (i+r1Down)*(j+r2Down);
			}
		}
		return auxTable;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("| XXXXX\t|");
		StringBuffer aux = new StringBuffer("--------");
		
		for (int i = 0; i < this.table[0].length; i++) {
			sb.append((i+r2Down)+"\t|");
			aux.append("--------");
		}
		sb.append("\n"+aux.toString()+"\n");
		for (int i = 0; i < this.table.length; i++) {
			sb.append("|"+(i+r1Down)+"\t|");
			for (int j = 0; j < this.table[0].length; j++) {
				sb.append(table[i][j]+"\t|");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public int[][] getTable() {
		return table;
	}

	public void setTable(int[][] table) {
		this.table = table;
	}

}
