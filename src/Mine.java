import java.util.Random;

public class Mine extends BattleLocation{

    Random random = new Random();
    int setDamage;

    public Mine(Player player) {
        super(player, "Mine",null,  "SomeReward", 5);
        setDamage = random.nextInt(4) + 3;
        this.setObstacle(new Obstacle(4, "Snake", setDamage, 12, 0));
        setReward();
    }

    public void setReward(){
        int percentile = random.nextInt(101) + 1;

        if (percentile > 0 && percentile <= 15){ // weapon drop rate

            int newPercentile = random.nextInt(101) + 1;
            Weapon droppedweapon;

            if (newPercentile > 0 && newPercentile <= 20) {

                droppedweapon = Weapon.getWeaponObjByID(3);
                this.getPlayer().getInventory().setWeapon(droppedweapon);
                print("Woah congrats, now you have magical powers!");
            }
            if (newPercentile > 20 && newPercentile <= 50) {

                droppedweapon = Weapon.getWeaponObjByID(2);
                this.getPlayer().getInventory().setWeapon(droppedweapon);
                print("Nice dude, you dropped the Gun.");
            }
            else {

                droppedweapon = Weapon.getWeaponObjByID(1);
                this.getPlayer().getInventory().setWeapon(droppedweapon);
                print("Meh, you dropped yhe Sword. Now you have to use it haha XD");
            }
        }

        else if (percentile > 15 && percentile <= 30){ // armor drop rate

            int newPercentile = random.nextInt(101) + 1;
            Armor droppedarmor;

            if (newPercentile > 0 && newPercentile <= 20) {

                droppedarmor = Armor.getArmorObjByID(3);
                this.getPlayer().getInventory().setArmor(droppedarmor);
                print("Woah congrats, you dropped Heavy Armor!");
            }
            if (newPercentile > 20 && newPercentile <= 50) {

                droppedarmor = Armor.getArmorObjByID(2);
                this.getPlayer().getInventory().setArmor(droppedarmor);
                print("Nice dude, you dropped Medium Armor.");
            }
            else {

                droppedarmor = Armor.getArmorObjByID(1);
                this.getPlayer().getInventory().setArmor(droppedarmor);
                print("Meh, you dropped Light Armor. Now you have to use it haha XD");
            }
        }

        else if (percentile > 30 && percentile <= 55){ // money drop rate

            int newPercentile = random.nextInt(101) + 1;

            if (newPercentile > 0 && newPercentile <= 20) {

                this.getPlayer().setGold(this.getPlayer().getGold() + 10);
                print("You gained 10 gold. Here is your total balance: " + this.getPlayer().getGold());
            }
            if (newPercentile > 20 && newPercentile <= 50) {

                this.getPlayer().setGold(this.getPlayer().getGold() + 5);
                print("You gained 5 gold. Here is your total balance: " + this.getPlayer().getGold());
            }
            else {

                this.getPlayer().setGold(this.getPlayer().getGold() + 1);
                print("You gained 1 gold. Here is your total balance: " + this.getPlayer().getGold());
            }
        }

        else {
            print("You could not drop anything hehe :D");
        }
    }

    public void print(String text){
        System.out.println(text);
    }
}
