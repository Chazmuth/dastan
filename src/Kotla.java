class Kotla extends Square {

    public Kotla(Player p, String s) {
        super();
        belongsTo = p;
        symbol = s;
    }

    @Override
    public int getPointsForOccupancy(Player currentPlayer) {
        if (pieceInSquare == null) {
            return 0;
        } else if (belongsTo.sameAs(currentPlayer)) {
            if (currentPlayer.sameAs(pieceInSquare.getBelongsTo()) && (pieceInSquare.getTypeOfPiece().equals("piece") || pieceInSquare.getTypeOfPiece().equals("mirza"))) {
                return 5;
            } else {
                return 0;
            }
        } else {
            if (currentPlayer.sameAs(pieceInSquare.getBelongsTo()) && (pieceInSquare.getTypeOfPiece().equals("piece") || pieceInSquare.getTypeOfPiece().equals("mirza"))) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
