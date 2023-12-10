public class ToolStore extends NormalLocation{

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {

        print("__________Welcome to the store__________");
        print(" ");
        print("1- Weapons");
        print("2- Armors");
        print("3- Exit");
        print("Your choice: ");
        int selectCase = sc.nextInt();

        while (selectCase < 1 || selectCase > 3){
            print("Invalid input, try again: ");
            selectCase = sc.nextInt();
        }

        switch (selectCase){
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                break;
            case 3:
                print("Come and visit again dear :)");
                return true;
        }

        return true;
    }

    public void printWeapon(){

        print("__________Weapons__________");
        print(" ");
        for (Weapon w: Weapon.weapons()){
            print(w.getID() + "- " + w.getName() + " <Cost: " + w.getCost() + " , Damage: " + w.getDamage() + ">");
        }
    }

    public void buyWeapon(){
        print("Select your weapon:");
        int selectWeapon = sc.nextInt();
        if (selectWeapon < 1 || selectWeapon >= Weapon.weapons().length +1){
            print("Invalid input. Try again dear: ");
            selectWeapon = sc.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeapon);
        if (selectedWeapon != null){

            if (selectedWeapon.getCost() > getPlayer().getGold()){
                print("You are broke as hell haha you can not buy it :D");

            } else {
                print("You bought " +selectedWeapon.getName() + ", nice choose fighter!");
                int balance = this.getPlayer().getGold() - selectedWeapon.getCost();
                this.getPlayer().setGold(balance);
                print("Remaining balance: " + this.getPlayer().getGold());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }

    public void printArmor(){

    }

    public void menu(){

    }

    public void print(String text){
        System.out.println(text);
    }
}
