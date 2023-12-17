import java.util.Random;

public abstract class BattleLocation extends Location{

    private Obstacle obstacle;
    private String reward;
    private int maxObstacle;

    public BattleLocation(Player player, String locationName, Obstacle obstacle, String reward, int maxObstacle) {
        super(player, locationName);
        this.obstacle = obstacle;
        this.reward = reward;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNum = this.randomObstacleNum();

        print("You are at " + this.getLocationName() + " now.");
        print("Be careful little fighter! " + obsNum + " "+ this.getObstacle().getObstacleName() + " are living here.");
        System.out.print("<B>attle or <R>un ?");
        String selectCase = sc.nextLine().toUpperCase();

        if (selectCase.equals("B") && combat(obsNum)){
            print("You defeated all enemies at " + this.getLocationName() + "!");
            return true;
        } else {
            return false;
        }
    }

    public boolean combat(int obsNum){
        for (int i = 1; i <= obsNum; i++){
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){

                System.out.print("<H>it or <M>iss ?");
                String selectCombat = sc.nextLine().toUpperCase();

                if (selectCombat.equals("H")){
                    print("You hit first!");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();

                    if (this.getObstacle().getHealth() > 0){
                        print(" ");
                        print(this.getObstacle().getObstacleName() + " hit you!");

                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0){
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }

                } else {
                    return false;
                }
            }

            if (this.getObstacle().getHealth() == 0){
                print("Defeated the enemy!");
                print("Earned " + this.getObstacle().getAwardMoney() + " more money.");
                this.getPlayer().setGold(this.getPlayer().getGold() + this.getObstacle().getAwardMoney());
                print("Current Balance: " + this.getPlayer().getGold());
                print(" ");
            }

            if(this.getPlayer().getHealth() <= 0){
                print("BRUHHH YOU DIED XD");
                return false;
            }
        }
        return true;
    }

    public void afterHit(){
        print("Your health: " + this.getPlayer().getHealth());
        print(this.getObstacle().getObstacleName() + "'s health: " + this.getObstacle().getHealth());
        print(" ");
    }

    public void playerStats(){
        print("__________Player Stats__________");
        print("Health: " + this.getPlayer().getHealth());
        print("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        print("Damage: " + this.getPlayer().getTotalDamage());
        print("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        print("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        print("Money: " + this.getPlayer().getGold());
        print(" ");

    }

    public void obstacleStats(int i){
        print("__________" + i + ". " + this.getObstacle().getObstacleName() + "Stats__________");
        print("Health: " + this.getObstacle().getHealth());
        print("Damage: " + this.getObstacle().getDamage());
        print("Award Money: " + this.getObstacle().getAwardMoney());
        print(" ");
    }

    public int randomObstacleNum(){
        Random random = new Random();
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public void print(String text){
        System.out.println(text);
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
