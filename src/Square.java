class Square {
    protected String symbol;
    protected Piece pieceInSquare;
    protected Player belongsTo;

    public Square() {
        pieceInSquare = null;
        belongsTo = null;
        symbol = " ";
    }

    public void setPiece(Piece p) {
        pieceInSquare = p;
    }

    public Piece removePiece() {
        Piece pieceToReturn = pieceInSquare;
        pieceInSquare = null;
        return pieceToReturn;
    }

    public Piece getPieceInSquare() {
        return pieceInSquare;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPointsForOccupancy(Player currentPlayer) {
        return 0;
    }

    public Player getBelongsTo() {
        return belongsTo;
    }

    public boolean containsKotla() {
        if (symbol.equals("K") || symbol.equals("k")) {
            return true;
        } else {
            return false;
        }
    }
}
