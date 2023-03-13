package Number_5;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int code;
    private List<Player> players;

    public Team() {
        code = 0;
        players = new ArrayList<>();
    }    

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}