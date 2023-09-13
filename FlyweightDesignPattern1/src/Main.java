// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FlyweightRegistery registery= new FlyweightRegistery();
        registery.SetPlayerFlyweight("dumb", new PlayerFlyweight(1,2,3));
        registery.SetPlayerFlyweight("tank", new PlayerFlyweight(4,5,6));
        registery.SetPlayerFlyweight("bomber", new PlayerFlyweight(7,8,9));
        registery.SetPlayerFlyweight("machine", new PlayerFlyweight(10,11,12));

        Player[] allPlayers= new Player[1000];
        int x=0;
        for(int i=0;i<700;i++){
            Player p= new Player(1,new Point(),0,0,registery.GetPlayerFlyweight("dumb"));
            allPlayers[x]=p;
            x++;
        }

        for(int i=0;i<100;i++){
            Player p= new Player(1,new Point(),0,0,registery.GetPlayerFlyweight("tank"));
            allPlayers[x]=p;
            x++;
        }

        for(int i=0;i<100;i++){
            Player p= new Player(1,new Point(),0,0,registery.GetPlayerFlyweight("bomber"));
            allPlayers[x]=p;
            x++;
        }

        for(int i=0;i<100;i++){
            Player p= new Player(1,new Point(),0,0,registery.GetPlayerFlyweight("machine"));
            allPlayers[x]=p;
            x++;
        }
    }

}