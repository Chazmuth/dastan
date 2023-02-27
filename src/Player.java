class Player {
    private String name;
    private int direction, score;
    private MoveOptionQueue queue = new MoveOptionQueue();

    public Player(String n, int d) {
        score = 100;
        name = n;
        direction = d;
    }

    public boolean sameAs(Player APlayer) {
        if (APlayer == null) {
            return false;
        } else if (APlayer.getName().equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public String getPlayerStateAsString() {
        return name + System.lineSeparator() + "Score: " + score + System.lineSeparator() + "Move option queue: " + queue.getQueueAsString() + System.lineSeparator();
    }

    public void addToMoveOptionQueue(MoveOption newMoveOption) {
        queue.add(newMoveOption);
    }

    public void updateQueueAfterMove(int position) {
        queue.moveItemToBack(position - 1);
    }

    public void updateMoveOptionQueueWithOffer(int position, MoveOption newMoveOption) {
        queue.replace(position, newMoveOption);
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public int getDirection() {
        return direction;
    }

    public void changeScore(int amount) {
        score += amount;
    }

    public boolean checkPlayerMove(int pos, int startSquareReference, int finishSquareReference) {
        MoveOption temp = queue.getMoveOptionInPosition(pos - 1);
        return temp.checkIfThereIsAMoveToSquare(startSquareReference, finishSquareReference);
    }
}
