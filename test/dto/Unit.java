package test.dto;

public class Unit {
    private int hp;
    private int attack;
    private int defense;

    protected void setHp(int hp) {
        this.hp = hp;
    }

    void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}