package kg.geeks.HW6.attributes;

public class GameEntity {
    protected int damage;
    protected int health;

    public static int counter = 0 ;

    public GameEntity(int health, int damage) {
        this.damage = damage;
        this.health = health;
        counter++;
    }
}
