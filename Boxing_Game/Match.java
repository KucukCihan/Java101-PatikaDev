package Giris.Boxing_Game;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight)) {
            while((this.f1.health > 0) && (this.f2.health > 0)) {
                System.out.println("============== YENI ROUND ==============");
                if (fiftyChange() == 1) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();

            }
        } else {
            System.out.println("Sporcuların sıkletleri uygun değil!");
        }
    }

    public int fiftyChange() {      // 50:50 change generator
        List<Integer> givenList = Arrays.asList(1, 2);
        Random rand = new Random();
        int randomElement = givenList.get(rand.nextInt(givenList.size()));
        return randomElement;
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println(f2.fighterName + " galip oldu!");
            return true;
        } else if (f2.health == 0) {
            System.out.println(f1.fighterName + " galip oldu!");
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println(" ");
        System.out.println(f1.fighterName + " kalan can\t:" + f1.health);
        System.out.println(f2.fighterName + " kalan can\t:" + f2.health);
    }

}
