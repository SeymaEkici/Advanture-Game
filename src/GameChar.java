
public abstract class GameChar {

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
