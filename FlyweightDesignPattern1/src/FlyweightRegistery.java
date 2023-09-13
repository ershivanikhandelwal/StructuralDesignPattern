import java.util.HashMap;

public class FlyweightRegistery {
    HashMap<String,PlayerFlyweight> dict= new HashMap<>();
    public void SetPlayerFlyweight(String key, PlayerFlyweight fw){
        dict.put(key,fw);
    }

    public PlayerFlyweight GetPlayerFlyweight(String key){
        return dict.get(key);
    }
}
