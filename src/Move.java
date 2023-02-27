class Move {
    protected int rowChange, columnChange;

    Move(int r, int c) {
        rowChange = r;
        columnChange = c;
    }

    public int getRowChange() {
        return rowChange;
    }

    public int getColumnChange() {
        return columnChange;
    }
}
