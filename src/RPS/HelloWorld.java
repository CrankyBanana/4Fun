package RPS;

import java.util.List;
import java.util.ArrayList;

class HelloWorld {
    Input in = new Input();
    public static void main(String[] args) {
        HelloWorld helloworld = new HelloWorld();
        helloworld.RPS();
    }

    private void RPS() {
        Player p1 = new Player("Jaden");
        Player p2 = new Player("Phong");
        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        for (Player p : players) {
            play(p);
        }
        System.out.println(whoWins(p1, p2));
    }

    private void play(Player p) {
        String value = in.nextLine("It's " + p.name + "'s turn What would you like to play? (r/p/s): ");
  
        switch(value) {
            case "r": System.out.println(p.name + " played rock!"); p.value = "r"; break;
            case "p": System.out.println(p.name + " played paper!"); p.value = "p"; break;
            case "s": System.out.println(p.name + " played scissors!"); p.value = "s"; break;
            default: System.out.println("Error");
        }
    }

    private String whoWins(Player p1, Player p2) {
        String winner = "";
        String hand = p1.value;
        String hand2 = p2.value;
        
        if (hand.equals("r") && hand2.equals("p")) { winner = p2.name + " wins!"; }
        else if (hand.equals("r") && hand2.equals("s")) { winner = p1.name + " wins!"; }
        else if (hand.equals("r") && hand2.equals("r")) { winner = "It's a tie!"; }

        if (hand.equals("p") && hand2.equals("s")) { winner = p2.name + " wins!"; }
        else if (hand.equals("p") && hand2.equals("r")) { winner = p1.name + " wins!"; }
        else if (hand.equals("p") && hand2.equals("p")) { winner = "It's a tie!"; }

        if (hand.equals("s") && hand2.equals("r")) { winner = p2.name + " wins!"; }
        else if (hand.equals("s") && hand2.equals("p")) { winner = p1.name + " wins!"; }
        else if (hand.equals("s") && hand2.equals("s")) { winner = "It's a tie!"; }

        return winner;
    }
}