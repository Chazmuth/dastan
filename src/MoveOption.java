import java.util.ArrayList;
import java.util.List;

class MoveOption {
    protected String name;
    protected List<Move> possibleMoves;

    public MoveOption(String n) {
        name = n;
        possibleMoves = new ArrayList<>();
    }

    public void addToPossibleMoves(Move m) {
        possibleMoves.add(m);
    }

    public String getName() {
        return name;
    }

    public boolean checkIfThereIsAMoveToSquare(int startSquareReference, int finishSquareReference) {
        int startRow = startSquareReference / 10;
        int startColumn = startSquareReference % 10;
        int finishRow = finishSquareReference / 10;
        int finishColumn = finishSquareReference % 10;
        for (Move m : possibleMoves) {
            if (startRow + m.getRowChange() == finishRow && startColumn + m.getColumnChange() == finishColumn) {
                return true;
            }
        }
        return false;
    }
}
