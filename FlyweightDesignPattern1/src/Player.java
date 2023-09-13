import java.awt.*;

public class Player{
    public int currentHealth;
    public Point currentPosition;
    public int score;
    public int ranking;
    public PlayerFlyweight fw;
    public Player(int currHealth, Point p, int score, int ranking, PlayerFlyweight pf){
        this.currentHealth=currHealth;
        this.currentPosition=p;
        this.score=score;
        this.ranking=ranking;
        this.fw=pf;
    }
}