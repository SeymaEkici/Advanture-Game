public class Weapon {

    private String name;
    private int ID;
    private int damage;
    private int cost;

    public Weapon(String name, int ID, int damage, int cost) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.cost = cost;
    }

    public static Weapon[] weapons() {
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon("Sword", 1, 2, 25);
        weaponList[1] = new Weapon("Gun", 2, 3, 35);
        weaponList[2] = new Weapon("Magic", 3, 7, 45);
        return weaponList;
    }

    public static Weapon getWeaponObjByID(int id){

        for (Weapon w : Weapon.weapons()){
            if (w.getID() == id) {
                return w;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
