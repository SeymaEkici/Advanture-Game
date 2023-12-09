public class SafeHouse extends NormalLocation{

    public SafeHouse(Player player){
        super(player, "Safe House");
    }

    public boolean onLocation(){
        System.out.println("You are at the safe house.");
        System.out.println("Your health is full now, congrats!");
        return true;
    }
}
