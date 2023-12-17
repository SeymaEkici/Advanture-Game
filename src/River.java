public class River extends BattleLocation{

    public River(Player player) {
        super(player, "River", new Obstacle(3, "Bear", 7, 20, 12), "Water", 2);
    }
}
