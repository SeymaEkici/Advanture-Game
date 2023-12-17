public class Forest extends BattleLocation{

    public Forest(Player player) {
        super(player, "Forest", new Obstacle(2, "Vampire", 4, 14, 7), "Firewood", 3);
    }
}
