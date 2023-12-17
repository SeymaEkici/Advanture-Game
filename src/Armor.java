public class Armor {

    private int ID;
    private String name;
    private int block;
    private int cost;

    public Armor(int ID, String name, int block, int cost) {
        this.ID = ID;
        this.name = name;
        this.block = block;
        this.cost = cost;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Light Armor", 1, 15);
        armorList[1] = new Armor(2, "Medium Armor", 3, 25);
        armorList[2] = new Armor(3, "Heavy Armor", 5, 40);
        return armorList;
    }

    public static Armor getArmorObjByID(int id){

        for (Armor a : Armor.armors()){
            if (a.getID() == id) {
                return a;
            }
        }
        return null;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
