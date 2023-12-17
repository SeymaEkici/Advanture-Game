public class Cave extends BattleLocation{

    public Cave(Player player) {
        super(player, "Cave", new Obstacle(1, "Zombie", 3, 10, 4), "Food", 3);
    }
}
