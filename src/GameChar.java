
public class GameChar {

    private int ID;
    private String characterName;
    private int health;
    private int damage;
    private int gold;

    public GameChar(int ID, String characterName, int health, int damage, int gold) {
        this.ID = ID;
        this.characterName = characterName;
        this.health = health;
        this.damage = damage;
        this.gold = gold;
    }

    public static GameChar[] chars() {
        GameChar[] charList = new GameChar[3];
        charList[0] = new GameChar(1, "Samurai", 21, 5, 15);
        charList[1] = new GameChar(2, "Archer", 18, 7, 200);
        charList[2] = new GameChar(3, "Knight", 24, 8, 5);
        return charList;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
