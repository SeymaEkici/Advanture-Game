public class Obstacle {

    private int ID;
    private String obstacleName;
    private int damage;
    private int health;
    private int originalHealth;
    private int awardMoney;

    public Obstacle(int ID, String obstacleName, int damage, int health, int awardMoney) {
        this.ID = ID;
        this.obstacleName = obstacleName;
        this.damage = damage;
        this.health = health;
        this.originalHealth = health;
        this.awardMoney = awardMoney;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getObstacleName() {
        return obstacleName;
    }

    public void setObstacleName(String obstacleName) {
        this.obstacleName = obstacleName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(int awardMoney) {
        this.awardMoney = awardMoney;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
