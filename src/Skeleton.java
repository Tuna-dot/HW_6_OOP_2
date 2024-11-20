import kg.geeks.HW6.attributes.Weapon;

public class Skeleton extends Boss {

    private int numberOfBullets;

    public Skeleton(int health, int damage, Weapon weapon, int numberOfBullets) {
        super(health, damage, weapon);
        setNumberOfBullets(numberOfBullets);
    }

    public int getNumberOfBullets() {
        return numberOfBullets;
    }

    public void setNumberOfBullets(int numberOfBullets) {
        this.numberOfBullets = numberOfBullets;
    }

    @Override
    public void printInfo() {
        System.out.println( counter++ +  " Skeleton health: " + this.health + " | "
        + " Skeleton damage: " + this.damage + " | " +
        " Skeleton weapon type " + getWeapon().getWeaponType() + " | "+
                " Skeleton weapon name: " + getWeapon().getWeaponName() +
                " | " + " Skeleton number of bullets: " + getNumberOfBullets());

    }
}
