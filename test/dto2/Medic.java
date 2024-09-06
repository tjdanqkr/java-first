package test.dto2;

import test.dto.Unit;

public class Medic extends Unit {
    private final int id;

    public Medic(int id) {
        this.id = id;
        super.setHp(1);
        super.setDefense(1);
//        super.setAttack(); error
    }
}
