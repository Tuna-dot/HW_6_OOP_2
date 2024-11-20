import kg.geeks.HW6.attributes.GameEntity;
import kg.geeks.HW6.attributes.Weapon;

public class Boss extends GameEntity {
     protected Weapon weapon ;

public Boss(int health, int damage, Weapon weapon) {
    super(damage, health);
    setWeapon(weapon);
}

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo(){
        System.out.println( counter++ +
                " Boss health: " +  health + " | " + " Boss damage: " + damage + " | "
                + " Boss weapon type: " + getWeapon().getWeaponType() + " | "
                + " Boss weapon name: " + getWeapon().getWeaponName() + " |");
    }
}
