public class PlayerDau {
    private int gameNumber;
    private int gameWon;


    public PlayerDau() {
        this.gameNumber = 0;
        this.gameWon = 0;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public int getGameWon() {
        return gameWon;
    }
    public void addNumOfGames(boolean hasWon){
        if(hasWon){
            this.gameWon ++;
        }
        this.gameNumber ++;
    }
}
