import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Dau diceValue1= new Dau();
        Dau diceValue2= new Dau();
        PlayerDau player= new PlayerDau();

        while (askIfWantsToThrowAgain()){
            diceValue1.throwDice();
            diceValue2.throwDice();
            showDicesValue(diceValue1,diceValue2);
            player.addNumOfGames(hasWon(diceValue1, diceValue2));
            showPlayerStadistics(player);

        }

    }

    private static void showPlayerStadistics(PlayerDau player) {
        System.out.println("Num Victories: "+player.getGameWon());
        System.out.println("Num Partides: "+player.getGameNumber());
    }


    private static void printHasLost() {
        System.out.println("Has perdut la partida :'(");
        System.out.println("Tornar el dau2? ");
    }

    private static void printHasWon() {
        System.out.println("Has guanyat la partida! :D");
    }

    private static void showDicesValue(Dau diceValue1, Dau diceValue2) {
        System.out.println("El resultat del dau 1 és: " + diceValue1.getValue());

        System.out.println("El resultat del dau 2 és: " + diceValue2.getValue());

        System.out.println("El resultat total de la tirada dels daus és: " + (diceValue1.getValue() + diceValue2.getValue()));
        if (hasWon(diceValue1, diceValue2)) {
            printHasWon();

        } else {
            printHasLost();
        }
    }

    private static boolean hasWon(Dau diceValue1, Dau diceValue2) {
        int result = diceValue1.getValue() + diceValue2.getValue();
        return result == 7;

    }
    private static boolean askIfWantsToThrowAgain(){
        System.out.println("Tornar el dau2? ");
        Scanner sc = new Scanner(System.in);
        String option= sc.nextLine();
        return option.equalsIgnoreCase("s");

    }

}
