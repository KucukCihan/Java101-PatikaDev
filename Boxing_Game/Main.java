package Giris.Boxing_Game;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("SubZero", 10, 150, 100, 30);
        Fighter f2 = new Fighter("Scorpion", 15, 100, 90, 25);
        Match match = new Match(f1, f2, 80, 100);
        match.run();
    }

}
