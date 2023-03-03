package lesson2;

public class MultiplicationTable {
	private int rows, cols, from;
	private String table;

	public MultiplicationTable(int rows, int cols, int from) {
		this.rows=rows;
		this.cols=cols;
		this.from=from;
		buildTable();
	}

	private void buildTable() {
		StringBuffer table = new StringBuffer();
		StringBuffer separator = new StringBuffer();
		int res;
		for(int i = this.from; i<=this.cols; i++) {
			if(i == this.from) {
				table.append("\t|");
			}
			separator.append("---------");
			table.append("\t"+i);
		}
		
		table.append("\n"+separator+"\n");
		//table.append("\n\t|\t\n");
		
		for(int i=0;i<=this.rows;i++) {
			table.append(i+"\t|\t");
			
			for(int j=this.from;j<=this.cols;j++) {
				res=i*j;
				table.append(res+"\t");
			}
			table.append("\n");
		}
		
		this.table=table.toString();
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public int getFrom() {
		return from;
	}

	public void setFrom(int from) {
		this.from = from;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

}
