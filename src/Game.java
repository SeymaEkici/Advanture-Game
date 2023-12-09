import java.util.Scanner;

public class Game {

    public void start(){

        Scanner sc = new Scanner(System.in);

        print("Welcome to the adventure game!");
        print("May i know your name?");
        String playerName = sc.nextLine();

        Player player = new Player(playerName);
        print("Oh dear " +playerName +", the game already start.");
        print("If you are smart enough you can complete and win your freedom to the real world. So do your best!");

        print("Here are the characters:");
        player.selectChar();

        Location location = null;
        while(true){
            public void selectLoc(){

                System.out.println("Locations: ");
                System.out.println("1- Safe House");
                System.out.println("2- Tool Store");

                System.out.println("Where do you wanna go?");
                int selectLoc = sc.nextInt();
                switch (selectLoc) {
                    case 1:
                        location = new SafeHouse(player);
                        break;
                    case 2:
                        location = new ToolStore(player);
                        break;
                    default:
                        location = new SafeHouse(player);
                }

                location.onLocation();
            }
        }

    }

    public void print(String text){
        System.out.println(text);
    }
}