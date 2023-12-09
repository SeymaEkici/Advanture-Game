public class ToolStore extends NormalLocation{

    public ToolStore(Player player) {
        super(player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are at the store.");
        return true;
    }

    public void menu(){

    }

    public void buy(){

    }
}
