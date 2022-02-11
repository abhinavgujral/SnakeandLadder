import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SnakeAndLadder {
    Queue<player> players= new LinkedList<>();

    public SnakeAndLadder(){

    }

    public Queue<player> getPlayers() {
        return players;
    }

    public void setPlayers(List<player> players) {
        for (player player : players) {
            this.players.add(player);
            Board.getPieces().put(player.getId(), 0); //Each player has a piece which is initially kept outside the board (i.e., at position 0).
        }
        this.players = (Queue<player>) players;
    }

    void startgame() {
        Dice dice = new Dice();
        int diceValue = dice.rollDice();
        player currentplayer = players.poll();
        movePlayer(diceValue, currentplayer);
        if (hasplayerWon(currentplayer))
        {
            System.out.println(currentplayer.getName() + " wins the game");
        }
    }

    private void movePlayer(int diceValue, player currentplayer) {
        int oldposition= Board.getPieces().get(currentplayer.getId());
        int  newposition=oldposition+diceValue;
        int boardsize=Board.getSize();
         if(newposition>boardsize){
             newposition=oldposition;
         }
         else{
             newposition=checksnake(newposition);
             newposition=checkLadder(newposition);
         }
         Board.getPieces().put(currentplayer.getId(),newposition);
        System.out.println(currentplayer.getName() + " rolled a " + diceValue + " and moved from " + oldposition +" to " + newposition);
    }

    private int checkLadder(int newposition) {
        for(Ladder ladder:Board.getLadderList()){
            if(ladder.getStart()==newposition)
                newposition=ladder.getEnd();

        }
        return newposition;

    }

    private int checksnake(int newposition) {
        for(snakes snake:Board.getSnakesList()){
        if(snake.getStart()==newposition){
            newposition=snake.getEnd();
        }

        }
        return newposition;
    }



    private boolean hasplayerWon(player currentplayer) {
    return Board.getPieces().get(currentplayer.getId())==Board.getSize();

    }
    }
