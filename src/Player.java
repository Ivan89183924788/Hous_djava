//33Domashka
public class Player {
    private String nickname;
    private int wins;
    private int losses;
    private int score;

    public void setScore(int score) {
        this.score = score;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getNickname() {
        return nickname;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getScore() {
        return score;
    }

    public Player(String nickname, int wins, int losses, int score) {
        this.nickname = nickname;
        this.wins = wins;
        this.losses = losses;
        this.score = score;
    }

    @Override
    public String toString(){
        return "Player {nickname= '"+ nickname+"',wins= " +wins+",losses "+losses+ ",score " +score+ "}";
    }
}
