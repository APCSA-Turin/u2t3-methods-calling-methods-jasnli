package U2T3_ModifyingObjectState;
public class Game {
    // INSTANCE VARIABLES
    String gameName;
    int players;
    int score;
    int lives;

    // CONSTRUCTOR
    public Game(String name, int playerNum) {
        gameName = name;
        players = playerNum;
        lives = 3;
        score = 0;
    }

    // GETTER
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }
    public int getScore() {
        return score;
    }
    public int getLives() {
        return lives;
    }

    // ADD PLAYER
    public void addPlayer() {
        players ++;
    }

    // SCORE ADDER
    public void increaseScore(int increase) {
        score += increase;
    }

    // AVG SCORE
    public double averageScorePerPlayer() {
        return ((double) score/players);
    }

    // CHECK FOR LOSS
    public boolean checkForLoss() {
        if (score > 9 && lives > -1) {
            score = 0;
            return true;
        } else {
            return false;
        }
    }

    // LIFE DECREASE
    public void minusLife() {
        lives --;
    }

    // GAME OVER
    public boolean isGameOver() {
        if (lives < 0) {
            return true;
        } else {
            return false;
        }
    }

}