package enums;

public enum CharType {
    KNIGHT(150, 70, 150),
    TROLL(200, 10, 50);


    private final int hp, speed, armour;

    CharType(int hp, int speed, int armour){
        this.hp = hp;
        this.speed = speed;
        this.armour = armour;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmour() {
        return armour;
    }
}
