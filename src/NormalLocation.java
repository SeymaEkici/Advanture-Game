public abstract class NormalLocation extends Location{

    public NormalLocation(Player player, String locationName){
        super(player, locationName);
    }

    public boolean onLocation() {
        return true;
    }
}
