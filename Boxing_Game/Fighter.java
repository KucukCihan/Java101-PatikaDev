package Giris.Boxing_Game;

public class Fighter {
    String fighterName;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String fighterName, int damage, int health, int weight, double dodge) {
        this.fighterName = fighterName;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge  = dodge;
    }

    int hit(Fighter enemy) {
        System.out.println(this.fighterName + " -> " + enemy.fighterName + " " + this.damage + " hasar vurdu.");
        if (enemy.dodge()) {
            System.out.println(enemy.fighterName + " gelen hasarı blokladı!");
            return enemy.health;
        }
        if ((enemy.health - this.damage) < 0) {
            return 0;
        }

        return enemy.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

}
