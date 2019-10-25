package RPS;

import java.util.List;


import java.util.ArrayList;

class RPS {
    Input in = new Input();
    public static void main(String[] args) {
        RPS rps = new RPS();
        rps.run();
    }

    private void run() {
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("Jaden"));
        players.add(new Player("Phong"));
        for (Player p : players) {
            play(p);
        }
        System.out.println(whoWins(players.get(0), players.get(1)));
    }

    // Retrieves user's decision
    private void play(Player p) {
        String value = in.nextLine("It's " + p.name + "'s turn What would you like to play? (r/p/s): ");
  
        switch(value) {
            case "r": System.out.println(p.name + " played rock!"); p.value = "r"; break;
            case "p": System.out.println(p.name + " played paper!"); p.value = "p"; break;
            case "s": System.out.println(p.name + " played scissors!"); p.value = "s"; break;
        }
    }

    // Handles decision-making logic
    private String whoWins(Player p1, Player p2) {
        String winner = "";
        String hand = p1.value;
        String hand2 = p2.value;

        switch(hand) {
            case "r":
                if (hand2.equals("p")) { winner = p2.name + " wins!"; }
                if (hand2.equals("s")) { winner = p1.name + " wins!"; }
                if (hand2.equals("r")) { winner = "It's a tie!"; }
                break;
            case "p":
                if (hand2.equals("s")) { winner = p2.name + " wins!"; }
                if (hand2.equals("r")) { winner = p1.name + " wins!"; }
                if (hand2.equals("p")) { winner = "It's a tie!"; }
                break;
            case "s":
                if (hand2.equals("r")) { winner = p2.name + " wins!"; }
                if (hand2.equals("p")) { winner = p1.name + " wins!"; }
                if (hand2.equals("s")) { winner = "It's a tie!"; }
                break;
        }   
        return winner;
    }
}