import java.util.ArrayList;
import java.util.List;

class MoveOptionQueue {
    private List<MoveOption> queue = new ArrayList<>();

    public String getQueueAsString() {
        String queueAsString = "";
        int count = 1;
        for (MoveOption m : queue) {
            queueAsString += count + ". " + m.getName() + "   ";
            count += 1;
        }
        return queueAsString;
    }

    public void add(MoveOption newMoveOption) {
        queue.add(newMoveOption);
    }

    public void replace(int position, MoveOption newMoveOption) {
        queue.set(position, newMoveOption);
    }

    public void moveItemToBack(int position) {
        MoveOption temp = queue.get(position);
        queue.remove(position);
        queue.add(temp);
    }

    public MoveOption getMoveOptionInPosition(int pos) {
        return queue.get(pos);
    }
}
