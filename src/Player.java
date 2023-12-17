import java.util.Scanner;

public class Player {

    private int ID;
    private String characterName;
    private int health;
    private int originalHealth;
    private int damage;
    private int gold;
    private String playerName;
    private Inventory inventory;
    Scanner sc = new Scanner(System.in);

    public Player(String playerName){
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectChar(){

        for (GameChar gameChar: GameChar.chars()){
            System.out.println(gameChar.getID() + "- " + gameChar.getCharacterName() +
                    " <Damage: " + gameChar.getDamage() +
                    " , gold: " + gameChar.getGold() + ">");
        }

        System.out.println("Now choose your character: ");
        int choice = sc.nextInt();

        GameChar selectedChar = null;
        for (GameChar gameChar : GameChar.chars()) {
            if (gameChar.getID() == choice) {
                selectedChar = gameChar;
                break;
            }
        }

        if (selectedChar != null) {
            System.out.println("Selected character is " + selectedChar.getCharacterName() + ". Good luck " + getPlayerName() + "!");
            initPlayer(selectedChar);
        } else {
            System.out.println("Invalid choice. Please select a valid character.");
            selectChar();
        }
    }

    public void printInfo(){
        System.out.println(" ");
        System.out.println("__________Character Info__________");
        System.out.println(
                "Weapon: " + this.getInventory().getWeapon().getName() +
                "\t\tDamage: " + this.getTotalDamage() +
                "\t\tArmor: " + this.getInventory().getArmor().getName() +
                "\t\tBlock: " + this.getInventory().getArmor().getBlock() +
                "\t\tHealth: " + this.getHealth() +
                "\t\tMoney: " + this.getGold());
    }

    public void initPlayer(GameChar gameChar){
        this.setCharacterName(gameChar.getCharacterName());
        this.setHealth(gameChar.getHealth());
        this.setOriginalHealth(gameChar.getHealth());
        this.setDamage(gameChar.getDamage());
        this.setGold(gameChar.getGold());
        this.setID(gameChar.getID());
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
