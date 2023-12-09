import java.util.Scanner;

public class Player {

    private int ID;
    private String characterName;
    private int health;
    private int damage;
    private int gold;
    private String playerName;
    Scanner sc = new Scanner(System.in);

    public void selectChar(){

        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        for (GameChar gameChar : charList) {
            System.out.println(gameChar.getID() + "- " +gameChar.getCharacterName() +
                    "\tHealth: "+ gameChar.getHealth() +
                    "\tDamage: "+ gameChar.getDamage() +
                    "\tGold: "+ gameChar.getGold());
        }

        System.out.println("Now choose your character: ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                System.out.println("Enter the ID of character! Please try again.");
                selectChar();
        }

        System.out.println("Selected character is "+ getCharacterName()+ ". Good luck "+ getPlayerName()+ "!");
    }

    public void initPlayer(GameChar gameChar){
        this.setCharacterName(gameChar.getCharacterName());
        this.setHealth(gameChar.getHealth());
        this.setDamage(gameChar.getDamage());
        this.setGold(gameChar.getGold());
        this.setID(gameChar.getID());
    }

    public Player(String playerName){
        this.playerName = playerName;
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
