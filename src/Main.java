import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfsnakes=sc.nextInt();
        List<snakes> snakesList= new ArrayList<>();
        for(int i=0;i<noOfsnakes;i++)
            snakesList.add(new snakes(sc.nextInt(),sc.nextInt()));

        int noOfLadder=sc.nextInt();
        List<Ladder> Ladderlist= new ArrayList<>();
        for(int i=0;i<noOfLadder;i++)
            Ladderlist.add(new Ladder(sc.nextInt(),sc.nextInt()));

        int noOfPlayers=sc.nextInt();
        List<player> playerList= new LinkedList<>();
        for(int i=0;i<noOfPlayers;i++)
            playerList.add(new player(sc.next()));

        SnakeAndLadder game= new SnakeAndLadder();
         game.setPlayers(playerList);
         Board board= new Board();
         board.setLadderList(Ladderlist);
         board.setSnakesList(snakesList);

         game.startgame();

    }
}
