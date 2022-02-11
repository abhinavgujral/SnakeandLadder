import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
static final int size=100;
static List<snakes> snakesList=new ArrayList<>();
static List<Ladder> ladderList=new ArrayList<>();
private static Map<Integer, Integer> Pieces=new HashMap<>();

    public static int getSize() {
        return size;
    }

    public static List<snakes> getSnakesList() {
        return snakesList;
    }

    public void setSnakesList(List<snakes> snakesList) {
        this.snakesList = snakesList;
    }

    public static List<Ladder> getLadderList() {
        return ladderList;
    }

    public void setLadderList(List<Ladder> ladderList) {
        this.ladderList = ladderList;
    }

    public static Map<Integer, Integer> getPieces() {
        return Pieces;
    }

    public void setPieces(Map<Integer, Integer> pieces) {
        Pieces = pieces;
    }
}
