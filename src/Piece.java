class Piece {
    protected String typeOfPiece, symbol;
    protected int pointsIfCaptured;
    protected Player belongsTo;

    public Piece(String t, Player b, int p, String s) {
        typeOfPiece = t;
        belongsTo = b;
        pointsIfCaptured = p;
        symbol = s;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getTypeOfPiece() {
        return typeOfPiece;
    }

    public Player getBelongsTo() {
        return belongsTo;
    }

    public int getPointsIfCaptured() {
        return pointsIfCaptured;
    }
}
