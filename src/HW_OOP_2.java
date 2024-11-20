import kg.geeks.HW6.attributes.Weapon;
import kg.geeks.HW6.attributes.WeaponType;

public class HW_OOP_2 {
    public static void main(String[] args) {

        Boss Boss = new Boss(1500, 50, new Weapon
                (WeaponType.CHOPPING_WEAPONS, "The Black sword"));


        Skeleton Skeleton = new Skeleton(1000, 100, new Weapon(
                WeaponType.FIREARM, "Gun"), 25);

        Boss.printInfo();

        Skeleton.printInfo();
    }
}