package one.exercise;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void Character() {

    }

    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }

    public void fight() {
        weaponBehavior.useWeapon();
    }

}
